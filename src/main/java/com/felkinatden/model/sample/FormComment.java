package com.felkinatden.model.sample;

import com.felkinatden.model.Comment;
import org.springframework.web.multipart.MultipartFile;

public class FormComment {
    private Comment comment;

    private MultipartFile[] multipartFiles;

    public FormComment() {
    }

    public FormComment(Comment comment, MultipartFile[] multipartFiles) {
        this.comment = comment;
        this.multipartFiles = multipartFiles;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public MultipartFile[] getMultipartFiles() {
        return multipartFiles;
    }

    public void setMultipartFiles(MultipartFile[] multipartFiles) {
        this.multipartFiles = multipartFiles;
    }
}
