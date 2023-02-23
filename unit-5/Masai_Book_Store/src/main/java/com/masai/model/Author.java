package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

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
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authorId;
	
	@NotBlank(message = "name is required")
	@Pattern(regexp = "^[A-Za-z]+$", message = "name must not contain numbers or special characters")
	private String name;
	
	@NotBlank(message = "Mobile number is required")
	@Pattern(regexp = "\\d{10}", message = "Mobile number must have 10 digits")
	private String mobileNo;
	
	@NotBlank(message = "Address is required")
	private String address;
	
	@OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();
}











