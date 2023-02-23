package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Author;

@Repository
public interface AuthorDao extends JpaRepository<Integer, Author>{

}
