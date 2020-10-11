package com.felkinatden.repository;

import com.felkinatden.model.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IMultimedia extends JpaRepository<Multimedia, Long> {
    Multimedia findByAvatar(long avatar);
    List findAllByUserId(long userId);
    List findAllByPostId(long postId);
    List findAllByCommentId(long commentId);
}
