package com.example.demo.repository;

import com.example.demo.entity.LoginUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//@Repository
//@EnableJpaRepositories
public interface UserRepository extends JpaRepository<LoginUsers, Long> {
    LoginUsers findByUsername(String username);
}
