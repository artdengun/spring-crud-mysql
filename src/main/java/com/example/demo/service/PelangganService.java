/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.Pelanggan;
import com.example.demo.Repository.PelangganRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class PelangganService {

    @Autowired
    private PelangganRepository pelangganRepository;
    
    // list data
    
    public List<Pelanggan> getPelanggan() {
        return pelangganRepository.findAll();
    }
    
    public void save(Pelanggan pelanggan) {
        pelangganRepository.save(pelanggan);
    }
    
    public Optional<Pelanggan> findById(int id) {
        return pelangganRepository.findById(id);
    }
    
    public void delete(Integer id) {
        pelangganRepository.deleteById(id);
    }
     
}

