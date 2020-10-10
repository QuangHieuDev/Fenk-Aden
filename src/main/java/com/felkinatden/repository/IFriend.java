package com.felkinatden.repository;

import com.felkinatden.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IFriend extends JpaRepository<Friend, Long> {
    Iterable findAllByUserId(long userId);
    Iterable findAllByFriendId(long friendId);
    Optional findByUserIdAndFriendId(long userId, long friendId);
}
