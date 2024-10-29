package com.test.service;

import com.test.dao.BookDao;
import com.test.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book) {
        bookDao.insert(book);
    }

    public void removeBookById(Integer id) {
        bookDao.deleteById(id);
    }

    public Book getBookById(Integer id) {
        return bookDao.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }


}