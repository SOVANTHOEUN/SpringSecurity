package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class LoginUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Comment("사용자 아이디")
    @Column(name = "user_id", length = 30)
    private String userid;

    @Comment("사용자")
    @Column(name = "user_name", length = 30)
    private String username;

    @Comment("비빌번호")
    @Column(name = "password", length = 150)
    private String password;

    @Comment("이메일")
    @Column(name = "email", length = 50)
    private String email;

    @Comment("사용자 status")
    @Column(name = "enabled", length = 10)
    @ColumnDefault("true")
    private Boolean enabled;

}