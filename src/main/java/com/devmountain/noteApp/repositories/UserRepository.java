package src.main.java.com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
