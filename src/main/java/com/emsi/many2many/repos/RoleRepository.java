package com.emsi.many2many.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emsi.many2many.entities.Role;
import org.springframework.stereotype.Repository;

// ça indique que c'est un composant de la couche DAO
@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findRoleByName(String roleName);
}
