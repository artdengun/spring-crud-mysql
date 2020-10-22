/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

/**
 *
 * @author childcasavva
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "s_user_roles")
public class UserRoles {
    
    @Id
    @GeneratedValue
    private Integer id;
    
     @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;
    
}
