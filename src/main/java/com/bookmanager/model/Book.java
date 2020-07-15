package com.bookmanager.model;

import java.util.Calendar;

public class Book {
	private long bookId;
	private String bookName;
	private String writer;
	private long count;
	private long rest;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getRest() {
		return rest;
	}
	public void setRest(long rest) {
		this.rest = rest;
	}
	
	public void bookRandom()
	{
		Calendar c = Calendar.getInstance();	//创建表示当前时间的Calendar对象
		int second = c.get(Calendar.SECOND);					//获得当前时间的秒
		int millsecond = c.get(Calendar.MILLISECOND);			//获得当前时间的秒
		String name = "book" + second + "-" + millsecond;
		this.setBookName(name);
		String writer = "alex001";
		this.setWriter(writer);
		int count = 9;
		this.setCount(count);
		int rest = 9;
		this.setRest(rest);
	}
	
	public void bookShow() {
		String info = "书名:" + bookName + ",作者:" + writer + ",剩余:" + rest; 
		System.out.println(info);
	}
}
