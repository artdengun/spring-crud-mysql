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
import javax.validation.constraints.NotBlank;
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
@Table(name = "country")
public class Country {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String nama;
    public String asal;
    public String email;
    public String alamat;
}
