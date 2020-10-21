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
@Table(name = "table_pembelian_bahan_baku")
public class BahanBaku {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id_pembelian;
    public String tgl_pembelian_bb;
    public String nama_brg_bb;
    public String harga_satuan_bb;
    public String banyak_bb;
    public String total_harga_bb;
    
}
