/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.Model.Country;
import com.example.demo.Repository.CountryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author childcasavva
 */
@Service
public class CountryService {
    
	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//SAve new country
	public void save(Country
                country) {
		countryRepository.save(country);
	}
	
	//get by id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
	
}
