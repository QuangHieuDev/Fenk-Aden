package com.felkinatden.model;

import javax.persistence.*;

@Entity
@Table(name = "likecount")
public class LikeCount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long postId;

    public LikeCount() {
    }

    public LikeCount(Long userId, Long postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public LikeCount(Long id, Long userId, Long postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
