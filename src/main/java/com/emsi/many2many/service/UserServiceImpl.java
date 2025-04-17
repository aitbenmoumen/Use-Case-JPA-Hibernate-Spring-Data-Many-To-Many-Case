package com.emsi.many2many.service;

import com.emsi.many2many.entities.Role;
import com.emsi.many2many.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public User addNewUser(User user) {
        return null;
    }

    @Override
    public Role addNewRole(Role role) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public Role findRoleByName(String roleName) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, User user) {

    }
}
