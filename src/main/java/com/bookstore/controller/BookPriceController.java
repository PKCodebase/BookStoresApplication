package com.bookstore.controller;

import com.bookstore.entity.BookPrice;
import com.bookstore.service.BookPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book-price")
public class BookPriceController {

    private final BookPriceService bookPriceService;

    public BookPriceController(BookPriceService bookPriceService) {
        this.bookPriceService = bookPriceService;
    }


    @GetMapping("/{bookId}")
    public ResponseEntity<BookPrice> getBookPriceById(@PathVariable Integer bookId){
        return ResponseEntity.ok(bookPriceService.getBookById(bookId));
    }
}
