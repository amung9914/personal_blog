package personal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.blog.entity.File;

public interface FileRepository extends JpaRepository<File,Long> {
}
