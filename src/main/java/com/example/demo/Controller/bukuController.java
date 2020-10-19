package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Buku;
import com.example.demo.Repository.bukuRepository;
import com.example.demo.Service.bukuService;

@RestController
public class bukuController {
	

	@Autowired 
	private bukuService book;

	// panggil data dalam list 
	@GetMapping("/c")
	public String getBuku(Model model) {
		List<Buku> dataList = book.tampilkanListBuku();
		model.addAttribute("data",dataList);
		
		return "Buku";
	}
	
	// tambah data 
	@PostMapping("books/tambah")
	public String tambahData(Buku buku ) {
		book.save(buku);
		
		return "redirect:books";
	}
	
	// edit data
	@RequestMapping(value = "books/edit", method = {RequestMethod.PUT, RequestMethod.POST})
	public String updateData(Buku buku) {
		book.save(buku);
		return "redirect:books";
	}
	
	// delete data
	
	@RequestMapping(value = "books/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Long id) {
		book.delete(id);
		return "redirect:books";
	}
	
	// cari data by id 
	
	@RequestMapping("books/findById") 
	@ResponseBody
	public Optional<Buku> findById(long id) {
	 return	book.findById(id);
	}
	
}
