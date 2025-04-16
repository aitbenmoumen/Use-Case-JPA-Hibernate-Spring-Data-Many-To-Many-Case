package com.emsi.many2many.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor  @AllArgsConstructor @ToString
@Entity
@Table(name = "USERS")
public class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    @ManyToMany
    private List<Role> roles;
}
