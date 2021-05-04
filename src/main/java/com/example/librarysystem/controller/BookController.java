package com.example.librarysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.librarysystem.service.BookService;

import java.awt.print.Book;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", bookService.getAllbook());
        return "index";
    }

    @GetMapping("/new")
    public String showNewBookForm(Model model) {
        // create model attribute to bind form data
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book";
    }

//    @PostMapping("/saveBook")
//    public String saveBook(@ModelAttribute("book") Book book) {
//        // save employee to database
//        bookService.saveBook(book);
//        return "redirect:/";
//    }
//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
//
//        // get employee from the service
//        Book book = bookService.getBookById(id);
//        // set employee as a model attribute to pre-populate the form
//        model.addAttribute("book", book);
//        return "update_book";
//    }

}
