/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import javax.persistence.Entity;
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
@Table(name = "table_penjualan")
public class Penjualan {
    @Id
    public String total_harga;
    
}
