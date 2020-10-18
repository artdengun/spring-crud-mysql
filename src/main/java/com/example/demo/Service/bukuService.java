package com.example.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Buku;
import com.example.demo.Repository.bukuRepository;

@Service
public class bukuService {
	
	@Autowired
	private bukuRepository buku;

	// menampilkan data
	public Iterable<Buku> findAll() {
		return buku.findAll();
	}
	// save data
	public Buku save(Buku x) {
		return buku.save(x);
	}
	// update data

	// edit data 
	
	// delete 
	public void delete(Buku x) {
		this.buku.delete(x);
	}
	
	// delete by id 
	public void deleteById(Long y) {
		this.buku.deleteById(y);
	}
	
	// delete semua 
	public void deleteAll() {
		this.buku.deleteAll();
	}
	

}
