package mmaend.Simplefb.repo;

import mmaend.Simplefb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
