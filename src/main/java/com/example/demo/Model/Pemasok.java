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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "table_pemasok")
public class Pemasok {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id_pemasok;
    public String nama_pemasok;
    public String alamat_pemasok;
    public String tlp_pemasok;
    public String email_pemasok;
    
}
