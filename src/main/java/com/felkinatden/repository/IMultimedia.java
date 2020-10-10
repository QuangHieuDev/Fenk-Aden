package com.felkinatden.repository;

import com.felkinatden.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMultimedia extends JpaRepository<Multimedia, Long> {
}
