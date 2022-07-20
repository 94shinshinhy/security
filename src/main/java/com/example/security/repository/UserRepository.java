package com.example.security.repository;

import com.example.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고있음
// @Repository라는 어노테이션이 없어도 IOC됨. 이유는 JpaRepository를 상속했기때문에
public interface UserRepository extends JpaRepository<User, Integer> {
    // findBy 규칙 => Username 문법
    // select * from user where username = 1?
    public User findByUsername(String username); // jpa query methods
}
