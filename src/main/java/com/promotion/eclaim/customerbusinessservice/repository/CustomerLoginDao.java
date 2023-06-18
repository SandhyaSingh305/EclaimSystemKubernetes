package com.promotion.eclaim.customerbusinessservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promotion.eclaim.customerbusinessservice.entity.UserLoginDetails;

public interface CustomerLoginDao extends JpaRepository<UserLoginDetails, String>{

	List<UserLoginDetails> findByUserNameAndPassword(String userName,String password);

	//@Query("SELECT NAME FROM CUSTOMER CUST WHERE CUST.EMAIL=? AND CUST.PASSWORD = ? AND POLICYID = ?")
//	List<Customer> findByEmailAndPasswordAndPolicyId(String email, String password,String policyId);

}
