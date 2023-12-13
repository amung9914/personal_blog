package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.Authorities;

public interface AuthoritiesRepository extends JpaRepository<Authorities,Long> {
}
