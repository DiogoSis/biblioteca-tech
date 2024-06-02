package com.api.apibooks.services;

import com.api.apibooks.domain.Book;
import com.api.apibooks.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices{
    private final BookClient bookClient;

    public BookServices(BookClient client){
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){

        return this.bookClient.getBooks();
    }
}