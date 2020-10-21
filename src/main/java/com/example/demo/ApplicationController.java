/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author childcasavva
 */
@Controller
public class ApplicationController {
    
    
    @GetMapping("/index")
    public String goHome(){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(){
    return "login";
            }
    
    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
    
    @GetMapping("/register")
    public String register(){
    return "register";}
}
