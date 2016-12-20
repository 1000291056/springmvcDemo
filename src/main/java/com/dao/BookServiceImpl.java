package com.dao;

import com.bean.Book;
import com.bean.Category;
import com.dao.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wufeifei on 2016/12/20.
 */
@Service
public class BookServiceImpl implements BookService {
    /**
     * the implementation is not thread-safe
     */
    private List<Category> categories = new ArrayList<Category>();
    private List<Book> books = new ArrayList<Book>();

    public BookServiceImpl() {
        Category category1 = new Category(1, "计算机");
        Category category2 = new Category(2, "旅行");
        Category category3 = new Category(3, "健康");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        books.add(new Book(1L, "198911145218", "Servlet&jsp", category1, "wufeifei"));
        books.add(new Book(1L, "198911145219", "埃菲尔铁塔", category2, "sunny"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        for (Category c : categories
                ) {
            if (id == c.getId()) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book saveBook(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book temp = books.get(i);
            if (temp.getId() == book.getId()) {
                books.set(i, book);
                break;
            }
        }
        return book;
    }

    @Override
    public Book get(int id) {
        for (Book b : books
                ) {
            if (id == b.getId()) {
                return b;
            }
        }
        return null;
    }

    @Override
    public long getNextId() {
        long id = 0L;
        for (Book b : books
                ) {
            long bId = b.getId();
            if (bId > id) {
                id = bId;
            }
        }
        return id + 1;
    }
}
