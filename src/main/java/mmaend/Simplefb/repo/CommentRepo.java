package mmaend.Simplefb.repo;

import mmaend.Simplefb.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
}