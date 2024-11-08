package com.openlibrary.Controller;

import java.util.List;

import com.openlibrary.Model.Book;
import com.openlibrary.Model.BookFactory;
import com.openlibrary.Model.BookService;
import com.openlibrary.Model.ExternalBook;
import com.openlibrary.Model.ExternalBookAdapter;
import com.openlibrary.Service.NotificationService;

public class LibraryFacade {
    private BookService bookService;
    private NotificationService notificationService;
    
    public LibraryFacade(){
        bookService = BookService.getInstance();
        notificationService = NotificationService.getInstance();
        bookService.addObserver(notificationService);
    }

    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    public void addBook(String type, String title, String author, String imgLink){
        Book book = BookFactory.createBook(type, getBooks().size(), title, author, imgLink);
        AddBookCommand addCommand = new AddBookCommand(bookService, book);
        addCommand.execute();
    }
    public void addExternalBook(ExternalBook externalBook){
        Book adaptedBook = new ExternalBookAdapter(externalBook);
        AddBookCommand addCommand = new AddBookCommand(bookService, adaptedBook);
        addCommand.execute();
    }
    public void removeBook(int id){
        RemoveBookCommand removeCommand = new RemoveBookCommand(bookService, id);
        removeCommand.execute();
    }
}
