package com.promotion.eclaim.customerbusinessservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotion.eclaim.customerbusinessservice.entity.Customer;
import com.promotion.eclaim.customerbusinessservice.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {

	@Autowired
	CustomerRepository customerRepo;

	@RequestMapping("/details")
	public List<Customer> getDetails() {
		
		
		return customerRepo.findAll() ;
	}
}
