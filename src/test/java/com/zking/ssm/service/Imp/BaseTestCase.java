package com.zking.ssm.service.Imp;

import com.zking.ssm.model.Book;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTestCase {
    protected Book book;

    public  void setUp(){
        book=new Book();
    }
}
