package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@NotBlank(message = "First name is required")
	@Pattern(regexp = "^[A-Za-z]+$", message = "First name must not contain numbers or special characters")
	private String firstName;

	@NotBlank(message = "Last name is required")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Last name must not contain numbers or special characters")
	private String lastName;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;

	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "\\d{10}", message = "Mobile number must have 10 digits")
	private String mobileNumber;

	private String address;

	@Min(value = 12, message = "Age must be above 12 years")
	private Integer age;

	@NotBlank(message = "Password is required")
	@Size(min = 6, max = 12, message = "Password must be between 6 and 12 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[A-Za-z\\d@#$%^&+=]+$",
	            message = "Password must contain at least one special character, one upper case, "
	            		+ "one lowercase, "
			               + " and one digit")
	private String password;

	@NotNull(message = "Gender is required")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@OneToMany(mappedBy = "user")
	private Set<Cart> cartItems = new HashSet<>();

	@NotBlank(message = "Budget can not be null")
	private Integer budget;

}
