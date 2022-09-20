package login.security.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
public class User extends BaseEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String email;
    private String username;
    private String password;
    private String role; // ROLE_USER, ROLE_ADMIN

    //회원 가입 사용
    public User(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
        setRole("ROLE_USER");
    }
}
