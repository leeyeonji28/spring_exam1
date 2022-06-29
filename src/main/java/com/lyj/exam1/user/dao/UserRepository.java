package com.lyj.exam1.user.dao;

import com.lyj.exam1.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // user table이랑 연결된 것 -> UserRepository
    // UserRepository에서 가져온 데이터는 User에 담음
}
