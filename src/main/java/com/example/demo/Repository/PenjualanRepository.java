/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Repository;

import com.example.demo.Model.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author childcasavva
 */
@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Integer>{
    
}
