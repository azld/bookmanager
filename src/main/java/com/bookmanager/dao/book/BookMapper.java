package com.bookmanager.dao.book;

import java.util.List;

import com.bookmanager.model.Book;

public interface BookMapper {
	int insertBook(Book abook);
	List<Book> getAll();
	Book selectById(long bookId);
	int checkout(Book abook);
}
