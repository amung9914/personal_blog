package personal.blog.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    private Article article;

    private String originFileName; //원본 파일명
    private String fileName; // Server에 저장되는 파일명
    private String filePath; // Server에 저장되는 경로

    @Builder
    public File(Article article, String originFileName, String fileName, String filePath) {
        this.article = article;
        this.originFileName = originFileName;
        this.fileName = fileName;
        this.filePath = filePath;
    }


}
