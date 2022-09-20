package login.security.auth;

import login.security.entity.User;
import login.security.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 시큐리티 설정에서 loginProcessingUrl("login");
 * /login/check 요청이 오면 자동으로 UserDetailsService 타입으로 Ioc 되어 있는 loadUserByUsername 함수가 실행
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

    private final LoginRepository loginRepository;

    // return : 시큐리티 session(내부 Authentication(내부 UserDetails))
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("email = {}", username);
        User findUser = loginRepository.findByEmail(username);
        if (findUser != null){
            return new PrincipalDetails(findUser);
        }
        return null;
    }
}
