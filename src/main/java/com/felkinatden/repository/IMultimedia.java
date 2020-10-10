package com.felkinatden.repository;

import com.felkinatden.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMultimedia extends JpaRepository<Multimedia, Long> {
    Iterable findAllByAvatar(long avatar);
    Iterable findAllByUserId(long userId);
    Iterable findAllByPostId(long postId);
    Iterable findAllByCommentId(long commentId);
}
