/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.Penjualan;
import com.example.demo.Repository.PenjualanRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */

@Service
public class PenjualanService {
    
    
   @Autowired
   private PenjualanRepository penjualanRepository;
   
   public List<Penjualan> getPenjualan(){
      return penjualanRepository.findAll();
   }
   
   public void save(Penjualan penjualan) {
       penjualanRepository.save(penjualan);
   }
   
   public Optional<Penjualan> findById(Integer id) {
       return penjualanRepository.findById(id);
   }
   
   public void delete(Integer Id) {
       penjualanRepository.deleteById(Id);
   } 
}
