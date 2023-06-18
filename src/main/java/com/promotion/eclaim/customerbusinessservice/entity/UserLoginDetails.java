package com.promotion.eclaim.customerbusinessservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity(name="UserLoginDetails")
public class UserLoginDetails {
	
	@Column(name="password")
	private String password;
	
	@Id
	@Column(name="username")
	private String userName;
	
	@Column(name="role")
	private String role;
	
}
