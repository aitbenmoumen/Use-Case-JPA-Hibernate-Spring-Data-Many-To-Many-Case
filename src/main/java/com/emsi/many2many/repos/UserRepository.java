package com.emsi.many2many.repos;

import com.emsi.many2many.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
