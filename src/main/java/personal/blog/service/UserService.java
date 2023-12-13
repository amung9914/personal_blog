package personal.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import personal.blog.dto.AddUserRequest;
import personal.blog.entity.Authorities;
import personal.blog.entity.User;
import personal.blog.repository.AuthoritiesRepository;
import personal.blog.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final AuthoritiesRepository authoritiesRepository;

    @Transactional
    public Long join(AddUserRequest dto){
        validateDuplacateUser(dto);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        User newUser = User.builder()
                .email(dto.getEmail())
                .password(encoder.encode(dto.getPassword()))
                .build();
        userRepository.save(newUser);

        Authorities auth = new Authorities("USER");
        authoritiesRepository.save(auth);
        auth.updateRole(newUser);

        return newUser.getId();
    }

    /**
     * 중복 가입 검증
     */
    private void validateDuplacateUser(AddUserRequest dto){
        Optional<User> byEmail = userRepository.findByEmail(dto.getEmail());
        if(byEmail.isPresent()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }



    }

}
