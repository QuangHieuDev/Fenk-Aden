package com.felkinatden.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "information")
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private long UserId;

    @NotNull
    private String information;

    public Information() {
    }

    public Information(Long id, @NotNull long userId, @NotNull String information) {
        this.id = id;
        UserId = userId;
        this.information = information;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
