package ee.valiit.back_jommu.domain.userrole.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.username = ?1 and u.password = ?2")
    Optional<User> findUserBy(String username, String password);

    @Query("select u from User u where u.username = ?1 and u.password = ?2 and u.role.type = ?3")
    Optional<User> findUserByRole(String username, String password, String type);





}