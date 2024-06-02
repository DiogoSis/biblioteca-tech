package com.api.apibooks.feign;

import com.api.apibooks.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-api",url = "https://books-dev-api.s3.amazonaws.com")
public interface BookClient {
    @GetMapping("/books-dev.json")
    List<Book> getBooks();
}
