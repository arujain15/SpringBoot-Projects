package com.example.demo.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.*;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{
	List<Customer> findByCity(String city);
	
	List<Customer> findByAgeBetween(int min, int max);
	
	List<Customer> findByNameStartingWith(String prefix);
}
