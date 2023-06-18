package com.promotion.eclaim.customerbusinessservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotion.eclaim.customerbusinessservice.entity.Customer;
import com.promotion.eclaim.customerbusinessservice.models.LoginRequest;
import com.promotion.eclaim.customerbusinessservice.repository.CustomerLoginDao;

@Service
public class CustomerServiceLoginService {

	
	@Autowired
	CustomerLoginDao customerLoginDao;  
	
	public boolean login(LoginRequest lr) {
//	  List<Customer>  list =	customerLoginDao.findByEmailAndPasswordAndPolicyId(lr.getEmail(),lr.getPassword(),lr.getPolicyId());
//		if(list!=null)
//			return true;
		return false;
	}
	
	
}
