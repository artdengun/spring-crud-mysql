/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.BahanBaku;
import com.example.demo.Repository.BahanBakuRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class BahanBakuService {
       
    // inject data
    @Autowired
    private BahanBakuRepository bahanBakuRepository;
    
    // return list 
    public List<BahanBaku> getBahanBaku(){
    return bahanBakuRepository.findAll();
            }
    
    // save new data
    public void save( BahanBaku bahanBaku) {
        bahanBakuRepository.save(bahanBaku);
    }
    
    // get by id
    public Optional<BahanBaku> findById(int id) {
    return bahanBakuRepository.findById(id);
    
    }
    
    // delete
    
    public void delete(Integer id) {
        bahanBakuRepository.deleteById(id);
    }
}
