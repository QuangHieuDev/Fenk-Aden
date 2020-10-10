package com.felkinatden.repository;

import com.felkinatden.model.LikeCount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILikeCount extends JpaRepository<LikeCount, Long> {
    Iterable findAllByUserId(long userId);
    Iterable findAllByPostId(long postId);
    Optional findByUserIdAndPostId(long userId, long postId);
}
