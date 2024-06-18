package com.education.portal.common;

import com.education.portal.model.Signup;

public class LoginResponse {

    private Signup user;
    private String token;
	
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginResponse(String token, Signup user) {
		super();
		this.user = user;
		this.token = token;
	}
	@Override
	public String toString() {
		return "LoginResponse [user=" + user + ", token=" + token + ", getUser()=" + getUser() + ", getToken()="
				+ getToken() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public Signup getUser() {
		return user;
	}
	public void setUser(Signup user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
    

    // Constructors, Getters, and Setters
}
