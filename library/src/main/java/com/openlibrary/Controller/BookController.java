package com.openlibrary.Controller;
import com.openlibrary.Model.Book;
import com.openlibrary.Model.BookService;

import java.util.List;

// BookController.java
public class BookController {

    public BookController() {
        this.bookService = BookService.getInstance();
    }
    public void addBook(String type, int id, String title, String author, String imgLink) {
    }

    public List<Book> getAllBooks() {

    }


}