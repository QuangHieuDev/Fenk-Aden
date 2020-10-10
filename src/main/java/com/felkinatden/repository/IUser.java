package com.felkinatden.repository;

import com.felkinatden.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
