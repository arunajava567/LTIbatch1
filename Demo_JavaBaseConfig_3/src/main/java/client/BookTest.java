package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.MyBookConfig;
import com.cg.bean.Author;
import com.cg.bean.Book;
import com.cg.bms.service.BookServiceImpl;
public class BookTest {
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	public void calService() {
		AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(MyBookConfig.class);
		Book book1=(Book)ctx.getBean("book");
		BookServiceImpl bookServiceImpl=(BookServiceImpl)ctx.getBean("bookServiceImpl");
		bookServiceImpl.addBook(book1);
		
		Author a=(Author)ctx.getBean("author");
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{	BookTest test=new BookTest();
	test.calService();
	}
}
