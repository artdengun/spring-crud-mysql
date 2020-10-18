package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.bukuRepository;

@RestController
@RequestMapping(name = "/crud/")
public class bukuController {
	
	@Autowired bukuRepository buku;
	
	// menampilkan data
	
	@GetMapping("list")
	public String dataList(Model model) {
		model.addAttribute("buku", buku.findAll());
		return "index";
	}

}
