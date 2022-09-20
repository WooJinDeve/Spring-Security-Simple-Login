package login.security.dto;

import lombok.Data;

@Data
public class JoinFormDto {
    private String username;
    private String password;
    private String email;
}
