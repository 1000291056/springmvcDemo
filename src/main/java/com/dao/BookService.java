package com.dao;

import com.bean.Book;
import com.bean.Category;

import java.util.List;

/**
 * Created by wufeifei on 2016/12/20.
 */
public interface BookService {
    List<Category> getAllCategories();

    Category getCategory(int id);

    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book updateBook(Book book);

    Book get(int id);

    long getNextId();
}
