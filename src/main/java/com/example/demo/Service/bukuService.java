package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Buku;
import com.example.demo.Repository.bukuRepository;

@Service
public class bukuService {
	
	@Autowired
	bukuRepository buku;
	
	// tambah data
	
	public void save(Buku book) {
		buku.save(book);
	}
	
	// get data by id 
	
	public Optional<Buku> findById(long id) {
		return buku.findById(id);
	}
	
	// tampilkan data
	public List<Buku> tampilkanListBuku() {
		return buku.findAll();
	}
	
	// delete by id
	
	public void delete(Long id) {
		buku.deleteById(id);
	}
	
	// delete semuanya 
	public void deleteAll() {
		buku.deleteAll();
	}
	
	

}
