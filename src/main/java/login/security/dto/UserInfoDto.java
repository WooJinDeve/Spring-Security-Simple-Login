package login.security.dto;

import login.security.entity.User;
import lombok.Data;

@Data
public class UserInfoDto {

    private String email;
    private String username;
    private String role;

    public UserInfoDto(User user) {
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.role = user.getRole();
    }
}
