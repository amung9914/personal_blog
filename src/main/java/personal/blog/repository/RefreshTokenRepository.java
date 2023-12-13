package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,Long> {
}
