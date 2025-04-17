package com.emsi.many2many.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor  @AllArgsConstructor @ToString
@Entity
@Table(name = "USERS")
public class User {
    @Id
    private String userId;
    // le username doit etre unique
    @Column(name = "USER_NAME", unique = true, length = 20)
    private String userName;

    private String password;
    @ManyToMany(mappedBy = "users", fetch= FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();
}
