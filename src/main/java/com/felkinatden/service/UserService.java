package com.felkinatden.service;

import com.felkinatden.model.User;
import com.felkinatden.repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUser iUser;

    public User findId(long id){
        return iUser.getOne(id);
    }

    public User findEmail(String email){
        return iUser.findByEmail(email);
    }

    public void save(User user){
        iUser.save(user);
    }

    public void delete(long id){
        iUser.deleteById(id);
    }
}
