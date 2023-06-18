package com.promotion.eclaim.customerbusinessservice.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotion.eclaim.customerbusinessservice.entity.Customer;
import com.promotion.eclaim.customerbusinessservice.models.ChangeBillCycleRequest;
import com.promotion.eclaim.customerbusinessservice.models.ClaimRequest;
import com.promotion.eclaim.customerbusinessservice.models.PaymentRequest;

@RestController
@RequestMapping("/customer/policy")
public class CustomerPolicyController {

	@RequestMapping("/changeBillCycle")
	public boolean changeBillCycle(@Validated @RequestBody  ChangeBillCycleRequest customer) {
		return false;
	}

	@RequestMapping("/makePayment")
	public boolean makePayment(@Validated @RequestBody PaymentRequest customer) {
		return false;
	}

	@RequestMapping("/submitClaim")
	public boolean submitClaim(@Validated @RequestBody ClaimRequest customer) {
		return false;
	}

//	@RequestMapping("/submitDoc")
//	public boolean submitDoc(DocRequest customer) {
//		return false;
//	}
//	
	@RequestMapping("/retrieveServiceProviders")
	public boolean retrieveServiceProviders(@Validated @RequestBody  Customer customer) {
		return false;
	}
}
