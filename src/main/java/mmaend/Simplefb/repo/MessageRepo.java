package mmaend.Simplefb.repo;

import mmaend.Simplefb.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}