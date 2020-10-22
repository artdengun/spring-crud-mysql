/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import java.nio.file.attribute.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
/**
 *
 * @author childcasavva
 */
@Service
public class UserService implements UserDetailsService{

    
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired 
    private UserRepository userRepository;
    
    
    
    public void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
    }

        
        @Override
        public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                User user = userRepository.findByName(s);
                if(user != null)
                        return new com.example.demo.Model.UserPrincipal(user);
        else return new com.example.demo.Model.UserPrincipal(new User());
    }
}
