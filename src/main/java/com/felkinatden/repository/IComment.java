package com.felkinatden.repository;

import com.felkinatden.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IComment extends JpaRepository<Comment, Long> {
    Iterable findAllByUserId(long userId);
    Iterable findAllByPostId(long postId);
    Optional findByUserIdAndAndPostId(long userId, long postId);
}
