package com.example.MyApp2.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyApp2.repository.CustomerRepo;

@RestController
public class MyController {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@GetMapping("/myApi")
	public String myApi() {
		return "Hello Everyone!";
	}
	
	@PostMapping("/saveCustomer")
	
	public Customer saveCust() {
		Customer cus=new Customer(1001,"John");
		return customerRepo.save(cus);
		
	}
	

}
