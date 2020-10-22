/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author childcasavva
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "s_role")
public class Roles {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String nama;
    
    
    @OneToMany(mappedBy = "role")
    private List<UserRoles> list = new ArrayList<>();
    
}
