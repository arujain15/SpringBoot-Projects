package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	
	public void saveCustomer(Customer c) {
		repo.save(c);
	}
	
	
	public void viewAllCustomers() {
        Iterable<Customer> list = repo.findAll();
        list.forEach(c -> 
            System.out.println(c.getName() + " " + c.getCity()+" " + c.getAge()));
    }
	
	public void findByCity(String city) {
        List<Customer> list = repo.findByCity(city);
        list.forEach(c -> System.out.println(c.getName()));
    }

    public void findByAgeBetween(int min, int max) {
        List<Customer> list = repo.findByAgeBetween(min, max);
        list.forEach(c -> System.out.println(c.getName()));
    }

    public void findByNameStartingWith(String prefix) {
        List<Customer> list = repo.findByNameStartingWith(prefix);
        list.forEach(c -> System.out.println(c.getName()));
    }


}
