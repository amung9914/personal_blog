package personal.blog.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Authorities {
    @Id @GeneratedValue
    @Column(name = "authorities_id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    private String role;

    // 생성 메서드


    public Authorities(String role) {
        this.role = role;
    }

    // 연관관계 메서드
    public void updateRole(User user){
        this.user = user;
        user.setUserRole().add(this);
    }



}
