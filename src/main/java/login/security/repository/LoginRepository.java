package login.security.repository;

import login.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {
    public User findByEmail(String loginId);
}
