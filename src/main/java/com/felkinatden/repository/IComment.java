package com.felkinatden.repository;

import com.felkinatden.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IComment extends JpaRepository<Comment, Long> {
    List findAllByUserId(long userId);
    List findAllByPostId(long postId);
    Comment findByUserIdAndPostId(long userId, long postId);
}
