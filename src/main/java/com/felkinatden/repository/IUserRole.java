package com.felkinatden.repository;

import com.felkinatden.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRole extends JpaRepository<UserRole, Long> {
    List findAllByUserId(long id);
    List findByUserIdAndRoleId(long userId, long roleId);
}
