package com.felkinatden.repository;

import com.felkinatden.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPost extends JpaRepository<Post, Long> {
    Iterable findAllByUserId(long userId);
}
