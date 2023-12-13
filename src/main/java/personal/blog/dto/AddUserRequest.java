package personal.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AddUserRequest {
    @NotEmpty
    private String email;
    private String password;
}
