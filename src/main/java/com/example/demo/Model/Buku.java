package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_buku")
public class Buku {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@NotNull
	public String penulis;
	@NotNull
	public String judul;
	@NotNull
	public Integer tahun;
}
