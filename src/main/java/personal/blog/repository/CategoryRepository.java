package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
