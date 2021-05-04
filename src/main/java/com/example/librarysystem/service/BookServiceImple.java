package com.example.librarysystem.service;

import com.example.librarysystem.model.Book;
import com.example.librarysystem.repository.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImple implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public List<Book> getAllbook() {
        return bookRepo.findAll();
    }

    @Override
    public void saveBook(Book book) {
        this.bookRepo.save(book);

    }

    @Override
    public Book getBookById(long id) {
        Optional< Book > optional = bookRepo.findById(id);
        Book book = null;
        if (optional.isPresent()) {
            book = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return book;
    }

    @Override
    public void deleteBookById(long id) {
        this.bookRepo.deleteById(id);

    }
}
