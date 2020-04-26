package com.in30minutes.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("himanshu") && password.equals("india");
	}

}