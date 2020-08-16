package com.shiv1.springbootmanytoone.service;

import java.util.List;
import java.util.Optional;

import com.shiv1.springbootmanytoone.entity.Book;

public interface BookService {

	public List<Book> saveBook(List<Book> book);
	public Optional<Book> findByBookId(int bookId);
}
