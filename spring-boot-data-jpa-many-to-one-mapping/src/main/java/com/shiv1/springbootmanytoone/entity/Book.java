package com.shiv1.springbootmanytoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@ManyToOne(targetEntity = Story.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "story_id",referencedColumnName = "storyId")
	private Story story;
	
	public Book() {
		
	}
	public Book(String bookName, Story story) {
		super();
		this.bookName = bookName;
		this.story = story;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}
}
