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
    @NotBlank(message = "nama harus di isi")
    public String nama;
    @NotBlank(message = "asal negara harus di isi")
    public String asal;
    @NotBlank(message = "email harus di isi")
    public String email;
    @NotBlank(message = "alamat harus di isi")
    public String alamat;
}
