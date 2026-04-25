package com.example.demo.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@Component
public class CustomerRunner implements CommandLineRunner{
	
	@Autowired
	private CustomerService service;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        sc.nextLine(); 

        for(int i = 0; i < n; i++) {
        	
        	System.out.println("Enter id:");
        	int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter city:");
            String city = sc.nextLine();

            System.out.println("Enter age:");
            int age = sc.nextInt();
            sc.nextLine();

            Customer c = new Customer(id, name, city, age);

            service.saveCustomer(c);
        }

        System.out.println("---- All Customers ----");
        service.viewAllCustomers();

        System.out.println("Enter city to search:");
        String city = sc.nextLine();
        service.findByCity(city);

        sc.close();
	}
}
