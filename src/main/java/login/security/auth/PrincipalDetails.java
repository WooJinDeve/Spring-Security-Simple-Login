package login.security.auth;


import login.security.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 시큐리티의 /login/check 요청을 처리 하여 로그인을 진행시켜야한다.
 * 로그인을 진행하면 시큐리티 sesstion을 생성한다. (Security ContextHolder)
 * 오브젝트 => Authentication Type 객체
 * Authentication 에 User 정보가 존재해야한다.
 * User 객체 타입은 => UserDetails 타입의 객체
 *
 */
@RequiredArgsConstructor
public class PrincipalDetails implements UserDetails {

    private final User user;

    // 해당 User의 권한을 리턴
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add((GrantedAuthority) user::getRole);
        return collect;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 휴먼 계정 처리 방법
        // 현재시간 - 로그인 시간 == 1년 이상 false;
        return true;
    }
}
