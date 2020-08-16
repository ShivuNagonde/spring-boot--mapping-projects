package com.shiv1.springbootmanytoone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shiv1.springbootmanytoone.entity.Book;
import com.shiv1.springbootmanytoone.entity.Story;
import com.shiv1.springbootmanytoone.service.BookServiceImpl;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST,value = "saveBook",produces = "application/json")
	//@ResponseBody
	public List<Book> saveBook(@RequestBody List<Book> bookList){
		Story story = new Story();
		//story.setStoryId(1);
		story.setStoryName("Mahabharat Story");
		for(Book book:bookList) {
		book.setStory(story);
		}
		List<Book> bookSaved=bookServiceImpl.saveBook(bookList);
		return bookSaved;
		}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getBook/{bookId}",produces = "application/json")
	//@ResponseBody
	public Optional<Book> getBookDetails(@PathVariable("bookId") int bookId) {
		Optional<Book> saveId=bookServiceImpl.findByBookId(bookId);
		return saveId;
	}
}
