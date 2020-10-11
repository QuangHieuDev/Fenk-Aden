package com.felkinatden.repository;

import com.felkinatden.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPost extends JpaRepository<Post, Long> {
    List findAllByUserId(long userId);
}
