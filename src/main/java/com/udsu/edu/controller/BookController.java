package com.udsu.edu.controller;

import com.udsu.edu.entity.Book;
import com.udsu.edu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping(name="/hello", consumes="application/json")
    public String hello(@RequestParam(value = "name", defaultValue = "my friend") String name) {
        return String.format("Hello, %s!", name);
    }

    @PostMapping(name="saveBook")
    public Book saveBook(@RequestParam Book book){
        return bookService.saveBook(book);
    }
}
