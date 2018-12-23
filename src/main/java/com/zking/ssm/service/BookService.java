package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookService {
    List<Book> queryPager(PageBean pageBean);
    Book selectByPrimaryKey(Integer id);
}