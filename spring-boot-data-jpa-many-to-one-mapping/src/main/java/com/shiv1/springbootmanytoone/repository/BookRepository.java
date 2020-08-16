package com.shiv1.springbootmanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiv1.springbootmanytoone.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}
