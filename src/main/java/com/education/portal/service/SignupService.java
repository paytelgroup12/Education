package com.education.portal.service;


import com.education.portal.model.Signup;

public interface SignupService {
    Signup saveUser(Signup signup);
  

    boolean authenticate(String username, String password);

	void changePassword(String email, String currentPassword, String newPassword);

	Signup getUserByUsername(String username);


}
