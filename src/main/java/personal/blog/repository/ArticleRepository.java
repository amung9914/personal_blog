package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
