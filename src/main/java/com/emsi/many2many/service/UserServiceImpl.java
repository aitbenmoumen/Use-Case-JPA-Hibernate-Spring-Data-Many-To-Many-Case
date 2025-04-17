package com.emsi.many2many.service;

import com.emsi.many2many.entities.Role;
import com.emsi.many2many.entities.User;
import com.emsi.many2many.repos.RoleRepository;
import com.emsi.many2many.repos.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service // annotation utilise pour referer la couche metier
@Transactional

@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private RoleRepository roleRepository;
    private UserRepository userRepository;
    /*
    public UserServiceImpl(RoleRepository repository, UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }
    */
    @Override
    public User addNewUser(User user) {
        // genarate new random ID
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }

    @Override
    public void addRoleToUser(String username, Role role) {
        User user = userRepository.findUserByUsername(username);
        user.getRoles().add(role);
    }
}
