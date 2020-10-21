/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.Pemasok;
import com.example.demo.Repository.PemasokRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class PemasokService {
    
    @Autowired
    private PemasokRepository pemasokRepository;
    
    
    public List<Pemasok> getPemasok() {
        return pemasokRepository.findAll();
    }
    
    public void save(Pemasok pemasok) {
        pemasokRepository.save(pemasok);
    }
    
    public Optional<Pemasok> findById(Integer Id){
        return pemasokRepository.findById(Id);
    }
    
    public void delete(Integer id) {
        pemasokRepository.deleteById(id);
    }
 }
