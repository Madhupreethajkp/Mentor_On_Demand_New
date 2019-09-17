package com.example.Microservice.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Microservice.model.Admin;



public interface AdminRepository extends CrudRepository<Admin, Long> {
	
	@Query("Select c From Admin c where c.username = :username and c.password = :password")
	Admin findUser(String username, String password);

}
