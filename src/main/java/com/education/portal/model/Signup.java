package com.education.portal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Signup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	@Column(name="First_Name")
	private String firstName;

	@Column(name="Last_Name")
	private String lastName;
	
	
	@Column(name = "user_name",unique=true)
	private String username;
	
	
	@Column(name="Phone_Number")
	private Long phoneNumber;
	@Column(name = "email",unique = true)
	private String email;

	private String password;
	
	@Column(name = "user_type")
	private String userType;

	@Column(name = "user_status")
	private int userStatus;

	@Column(name = "mode")
	private String mode;




}
