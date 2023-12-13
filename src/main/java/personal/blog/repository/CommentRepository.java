package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
