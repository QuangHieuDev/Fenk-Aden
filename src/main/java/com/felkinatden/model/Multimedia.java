package com.felkinatden.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "multimedia")
public class Multimedia {
    @Id
    private Long id;

    private long avatar;
    private long userId;
    private long postId;
    private long commentId;

    public Multimedia() {
    }

    public Multimedia(Long id, long avatar, long userId, long postId, long commentId) {
        this.id = id;
        this.avatar = avatar;
        this.userId = userId;
        this.postId = postId;
        this.commentId = commentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAvatar() {
        return avatar;
    }

    public void setAvatar(long avatar) {
        this.avatar = avatar;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }
}
