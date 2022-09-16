package cbnu.capstone.tripwithme.repository;

import cbnu.capstone.tripwithme.entity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserid(String userid);

    List<User> findByIdIn(List<Long> userid);

    Boolean existsByUserid(String userid);
}