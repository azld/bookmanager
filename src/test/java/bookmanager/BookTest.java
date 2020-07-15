package bookmanager;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bookmanager.model.Book;
import com.bookmanager.model.User;
import com.bookmanager.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class BookTest {
	private static Logger log = Logger.getLogger(Test.class.getClass());
	
	private BookService bookService;

	public BookService getBookService() {
		return bookService;
	}

	@Autowired
	public void setBookService(BookService bookService) {
		log.info("bookService setting ------------------");
		this.bookService = bookService;
	}
	
//	@Test
	public void bookAdd() {
		Book abook = new Book();
		abook.bookRandom();
		log.info("添加书" + abook.getBookName() + "开始---------------");
		this.bookService.add(abook);
		log.info("添加书" + abook.getBookName() + "结束---------------");
	}

	@Test
	public void getBook() {
		long bookId = 1;
		Book abook = this.bookService.selectByID(bookId);
		abook.bookShow();
	}
	
	@Test
	public void getAll()
	{
		List<Book> books = this.bookService.getAll();
		for(int i = 0; i < books.size(); i++)
		{
			Book book = books.get(i);
			book.bookShow();
		}
	}
	
	@Test
	public void bookCheckout()
	{
		List<Book> books = this.bookService.getAll();
		for(int i = 0; i < books.size(); i++)
		{
			System.out.println("--------------------------");
			Book book = books.get(i);
			book.bookShow();
			this.bookService.checkout(book);
		}
	}
}
