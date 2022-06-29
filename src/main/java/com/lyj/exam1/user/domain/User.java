package com.lyj.exam1.user.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class User {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public LocalDateTime regDate;
    public LocalDateTime updateDate;
    public String email;
    public String password;
    public String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
