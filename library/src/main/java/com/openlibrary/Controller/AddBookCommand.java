package com.openlibrary.Controller;

import com.openlibrary.Model.Book;
import com.openlibrary.Model.BookFactory;
import com.openlibrary.Model.BookService;




public class AddBookCommand implements Command {
    private BookService bookService;
    private Book book;

    @Override
    public void execute() {

    }
}