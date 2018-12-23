package com.zking.ssm.service.Imp;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.BookService;
import com.zking.ssm.util.PageBean;
import org.aspectj.lang.annotation.Aspect;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class IBookServiceImplTest extends BaseTestCase{
    @Autowired
    private BookService bookService;


    public void setUp()  {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void queryPage() {
        Book book=new Book();
        PageBean pageBean=new PageBean();
        List<Book> books = bookService.queryPager(pageBean);
        for (Book book1 : books){
            System.out.println(book1);
        }
    }@Test
    public void selectByPrimaryKey() {
        Book book=new Book();

        Book books = bookService.selectByPrimaryKey(24);
            System.out.println(books);
        System.out.println("-----------------------");
        Book booksss = bookService.selectByPrimaryKey(27);
        System.out.println(booksss);

    }
}