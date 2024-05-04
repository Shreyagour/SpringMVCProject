package com.learningbasic.mysbproject.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateUser {

	public boolean authentication(String username, String password) {
		boolean isValidUser=username.equalsIgnoreCase("dumdum");
		boolean isValidPassword=password.equalsIgnoreCase("pass");
		return isValidUser && isValidPassword;
	}
}
