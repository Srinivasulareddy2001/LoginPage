package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
    Login findByUsernameAndPassword(String username, String password);
}
