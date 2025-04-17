package com.emsi.many2many.service;

import com.emsi.many2many.entities.Role;
import com.emsi.many2many.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByName(String roleName);
    void addRoleToUser(String username, User user);
}
