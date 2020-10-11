package com.felkinatden.repository;

import com.felkinatden.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IFriend extends JpaRepository<Friend, Long> {
    List findAllByUserId(long userId);
    List findAllByFriendId(long friendId);
    Friend findByUserIdAndFriendId(long userId, long friendId);
}
