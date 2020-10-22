/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author childcasavva
 */

@Configuration
@EnableWebSecurity
public class webSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter{
    
    
    
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/mahasiwa/new").hasRole("OPERATOR")
                .antMatchers("/daftar/new").access("hasRole('ADMIN') and hasRole('OPERATOR')") // OR salah satu and dua duanya
                .anyRequest().authenticated()
                .and().formLogin().defaultSuccessUrl("/home").permitAll()
                .and().logout().logoutSuccessUrl("/home").permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider(UserService userService){
        DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
        dao.setUserDetailsService(userService);
        dao.setPasswordEncoder(passwordEncoder());
        return dao;

    }
    
}
