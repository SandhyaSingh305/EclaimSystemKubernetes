package com.promotion.eclaim.customerbusinessservice.models;

import lombok.Data;

@Data
public class LoginRequest {

	/**
	 * UserName can be email, policy id, mobile number
	 */
	private String userName;
	private String password;
	private String role;
}
