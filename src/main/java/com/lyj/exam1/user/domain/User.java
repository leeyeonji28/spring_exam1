package com.lyj.exam1.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

// @Entity
public class User {
    public long id;
    public LocalDateTime regDate;
    public LocalDateTime updateDate;
    public String email;
    public String password;
    public String name;
}
