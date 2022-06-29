package com.lyj.exam1.user.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Getter
public class User {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private String email;
    private String password;
    private String name;
}
