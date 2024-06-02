package com.api.apibooks.controllers;

import com.api.apibooks.domain.Book;
import com.api.apibooks.services.BookServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")

public class BookControllers {

    private final BookServices service;
    public BookControllers(BookServices service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = this.service.getBooksFromLibrary();
        return ResponseEntity.ok().body(books);
    }
}
