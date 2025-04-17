package com.emsi.many2many.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ROLES")
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String roleId;
    private String desc;
    @Column(unique = true, length = 20)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
    // @JoinTable(name = "USERS_ROLES")
    private List<User> users = new ArrayList<>();
}
