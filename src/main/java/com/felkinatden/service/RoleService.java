package com.felkinatden.service;

import com.felkinatden.model.Role;
import com.felkinatden.model.UserRole;
import com.felkinatden.repository.IRole;
import com.felkinatden.repository.IUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    private IRole iRole;
    @Autowired
    private IUserRole iUserRole;

    public List<Role> findRole(long userId) {
        ArrayList<Role> listRole = null;
        List<UserRole> roleId = iUserRole.findAllByUserId(userId);
        for (UserRole i : roleId) {
            Role role = iRole.getOne(i.getId());
            listRole.add(role);
        }
        return listRole;
    }

    public List<UserRole> findUserRole(long userId, long roleId) {
        return iUserRole.findByUserIdAndRoleId(userId, roleId);
    }

    public boolean isCheck(long userId, long roleId) {
        Boolean checked = false;
        if (iUserRole.findByUserIdAndRoleId(userId, roleId).size() > 0) {
            checked = true;
        }
        return checked;
    }

    public List<UserRole> save(long userId, long roleId) {
        if (!isCheck(userId, roleId)) {
            iUserRole.save(new UserRole(null, userId, roleId));
        }
        return findUserRole(userId, roleId);
    }

    public void delete(long userId, long roleId) {
        List<UserRole> lists = findUserRole(userId, roleId);
        for (UserRole i : lists) {
            iUserRole.delete(i);
        }
    }
}
