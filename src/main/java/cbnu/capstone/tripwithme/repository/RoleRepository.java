package cbnu.capstone.tripwithme.repository;

import cbnu.capstone.tripwithme.entity.User.Role;
import cbnu.capstone.tripwithme.entity.User.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}