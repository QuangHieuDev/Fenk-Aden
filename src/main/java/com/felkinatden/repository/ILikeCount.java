package com.felkinatden.repository;

import com.felkinatden.model.LikeCount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ILikeCount extends JpaRepository<LikeCount, Long> {
    List findAllByUserId(long userId);
    List findAllByPostId(long postId);
    LikeCount findByUserIdAndPostId(long userId, long postId);
}
