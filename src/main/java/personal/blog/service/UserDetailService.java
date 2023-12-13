package personal.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import personal.blog.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
// 스프링 시큐리티에서 사용자 정보를 가지고 오는 인터페이스를 구현함.
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    //email로 사용자 정보 가져온다
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .orElseThrow(()-> new IllegalArgumentException(email));
    }
}
