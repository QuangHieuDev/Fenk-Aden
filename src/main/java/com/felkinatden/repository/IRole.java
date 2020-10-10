package com.felkinatden.repository;

import com.felkinatden.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRole extends JpaRepository<Role, Long> {
}
