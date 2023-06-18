package com.promotion.eclaim.customerbusinessservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotion.eclaim.customerbusinessservice.models.ChangeAddressRequest;
import com.promotion.eclaim.customerbusinessservice.models.LoginRequest;
import com.promotion.eclaim.customerbusinessservice.service.CustomerServiceLoginService;

@RestController
@RequestMapping("/customer")
public class CustomerServiceLoginController {
	
	
	@Autowired
	CustomerServiceLoginService  customerServiceLoginService;
	
	@RequestMapping("/login")
	public boolean login(@Validated @RequestBody LoginRequest customer) {
		customerServiceLoginService.login(customer);
		return false;
	}

	@RequestMapping("/changeAddress")
	public boolean changeAddress(@Validated @RequestBody ChangeAddressRequest customer) {
		return false;
	}

	@RequestMapping("/forgotPassword")
	public boolean forgotPassword(@Validated @RequestBody ChangeAddressRequest customer) {
		return false;
	}
}
