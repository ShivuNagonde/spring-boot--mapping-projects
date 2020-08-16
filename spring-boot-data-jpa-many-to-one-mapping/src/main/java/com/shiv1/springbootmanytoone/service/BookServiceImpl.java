package com.shiv1.springbootmanytoone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiv1.springbootmanytoone.entity.Book;
import com.shiv1.springbootmanytoone.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	
	public List<Book> saveBook(List<Book> bookList) {
		List<Book> list=(List<Book>) bookRepository.saveAll(bookList);
		return list;
	}


	public Optional<Book> findByBookId(int bookId) {
		return bookRepository.findById(bookId);
	}

}
