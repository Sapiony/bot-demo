package Javabot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Javabot.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);

    User findByUsername(String username);
}