package com.bookmanager.service;

import java.util.List;

import com.bookmanager.model.Book;

public interface BookService {

	public Book add(Book abook);
	public List<Book> getAll();
	public Book selectByID(long bookId);
	public Book checkout(Book abook);
}
