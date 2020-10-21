/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author childcasavva
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id_user;
    public String user_name;
    public String password;
    public String nama_user;
    public String level;
    
}
