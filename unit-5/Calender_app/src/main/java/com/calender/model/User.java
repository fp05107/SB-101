package com.calender.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

	@Id
	private Integer userId;
	@Email
	private String email;
	@Min(0)
	private String firstName;
	
	private String lastName;
	@Min(10)
	@Max(10)
	private String mobileNumber;
	@NotBlank
	private LocalDate dateOfBirth;
	
}
