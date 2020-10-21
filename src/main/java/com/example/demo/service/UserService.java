/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class UserService {

    
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired 
    private UserRepository userRepository;
    
    public void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
    }
    
}
