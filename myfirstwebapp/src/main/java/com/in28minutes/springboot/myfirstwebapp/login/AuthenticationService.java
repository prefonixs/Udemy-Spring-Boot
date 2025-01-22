package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username,String password) {
		boolean isValidUserName = username.equals("sid");
		boolean isValidPassword = password.equals("123456");
		return isValidPassword && isValidUserName;
	}
}
