package Tables.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Brian Xicon
 */ 

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(int id);
    User findByUsername(String username);

    @Transactional
    void deleteById(int id);
}
