package com.masai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

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
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;

	@NotBlank(message = "Total can not be blank")
	private Integer total;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne
	@JoinColumn(name = "bookId")
	private List<Book> books;

}






