package personal.blog.controller.api;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.blog.dto.AddUserRequest;
import personal.blog.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(@Valid AddUserRequest request){

        Long id = userService.join(request);
        return id.toString();
    }


}
