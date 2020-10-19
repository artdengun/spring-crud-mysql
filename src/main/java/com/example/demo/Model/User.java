package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tabel_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@NotBlank(message = "harus di isi tidak boleh kosong")
	public String name;
	@NotBlank(message = "email harus di isi")
	public String email;
	public void setId(long id2) {
		// TODO Auto-generated method stub
		
	}
}
