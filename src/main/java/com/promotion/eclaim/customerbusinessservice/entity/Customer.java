package com.promotion.eclaim.customerbusinessservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity(name="CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@Column(name="customerName")
	private String customerName;
	@Column(name="zipCode")
	private int zipCode;
	@Column(name="email")
	private String email;
	@Column(name="policyId")
	private String policyId;

	

}
