package com.felkinatden.repository;

import com.felkinatden.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRole extends JpaRepository<UserRole, Long> {
    Iterable findAllByUserId(long userId);
}
