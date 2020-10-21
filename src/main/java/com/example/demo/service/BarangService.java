/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.Barang;
import com.example.demo.Repository.BarangRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class BarangService {
       
    @Autowired
    private BarangRepository barangRepository;
    
    // list barang
    public List<Barang> getBarang(){
        return barangRepository.findAll();
    } 
    
    // save 
    
    public void save(Barang barang){
         barangRepository.save(barang);
    }
    
    public Optional<Barang> findById(int id) {
        return barangRepository.findById(id);
    }
    
    public void delete(Integer id) {
        barangRepository.deleteById(id);
    }
}

