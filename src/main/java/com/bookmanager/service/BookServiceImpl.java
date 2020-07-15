package com.bookmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmanager.dao.book.BookMapper;
import com.bookmanager.model.Book;

@Service("BookService")
public class BookServiceImpl implements BookService {
	private BookMapper bookmapper;
	
	public BookMapper getBookmapper() {
		return bookmapper;
	}

	@Autowired
	public void setBookmapper(BookMapper bookmapper) {
		this.bookmapper = bookmapper;
	}

	@Override
	public Book add(Book abook) {
//		bookmapper.insertBook(abook);
		this.bookmapper.insertBook(abook);
		return abook;
	}

	@Override
	public List<Book> getAll() {
		List<Book> books = bookmapper.getAll();
		return books;
	}

	@Override
	public Book selectByID(long bookId) {
		Book abook = this.bookmapper.selectById(bookId);
		return abook;
	}

	@Override
	public Book checkout(Book abook) {
		long rest = abook.getRest();
		abook.setRest(rest - 1);
		this.bookmapper.checkout(abook);
		return abook;
	}
}
