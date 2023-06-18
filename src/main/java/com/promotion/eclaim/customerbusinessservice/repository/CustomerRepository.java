package com.promotion.eclaim.customerbusinessservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promotion.eclaim.customerbusinessservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

	


}
