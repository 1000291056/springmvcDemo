package com.controller;

import com.bean.Book;
import com.bean.Category;
import com.dao.BookService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wufeifei on 2016/12/20.
 */
@Controller
public class BookController {
    private static final Log logger = LogFactory.getLog(BookController.class);
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book_input")
    public String inputBook(Model model) {
        model.addAttribute("categories", bookService.getAllCategories());
        model.addAttribute("book", new Book());
        return "BookAddForm";
    }

    @RequestMapping(value = "/book_edit/{id}")
    public String editBook(Model model, @PathVariable long id) {
        model.addAttribute("categories", bookService.getAllCategories());
        Book book = bookService.get((int) id);
        model.addAttribute("book", book);
        return "BookEditForm";
    }

    @RequestMapping(value = "/book_save")
    public String saveBook(@ModelAttribute Book book) {
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.saveBook(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_update")
    public String updateBook(@ModelAttribute Book book) {
        Category category = bookService.getCategory(book.getCategory().getId());
        book.setCategory(category);
        bookService.updateBook(book);
        return "redirect:/book_list";
    }

    @RequestMapping(value = "/book_list")
    public String listBooks(Model model) {
        logger.info("book_list");
        model.addAttribute("books", bookService.getAllBooks());
        return "BookList";
    }
}
