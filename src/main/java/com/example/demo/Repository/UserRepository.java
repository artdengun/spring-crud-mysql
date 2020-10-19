package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    @Query("SELECT p FROM table_buku")
}
