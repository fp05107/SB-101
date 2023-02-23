package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;

	@NotBlank(message = "name is required")
	@Pattern(regexp = "^[A-Za-z]+$", message = "name must not contain numbers or special characters")
	private String name;

	@NotNull
	private Integer pages;

	@NotNull
	private String publisher;

	@NotNull
	private Integer price;

	@ManyToOne
	@JoinColumn(name = "authorId")
	private Author author;

	@ManyToMany(mappedBy = "books")
	private Set<Cart> cartItems = new HashSet<>();

}










