package com.bookstore.controller;

import com.bookstore.entity.BookPrice;
import com.bookstore.service.BookPriceService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/book-price")
public class BookPriceController {

    private final BookPriceService bookPriceService;

    public BookPriceController(BookPriceService bookPriceService) {
        this.bookPriceService = bookPriceService;
    }


    @Operation(summary = "Get book price by ID" )
    @GetMapping("bookPrice/{bookId}")
    public ResponseEntity<BookPrice> getBookPriceById(@PathVariable Integer bookId){
        return ResponseEntity.ok(bookPriceService.getBookById(bookId));
    }

    @Operation(summary = "Get offer book price by ID" )
    @GetMapping("/offerBook/{bookId}")
    public ResponseEntity<Double> getOfferBookPriceById(@PathVariable Integer bookId){
        return ResponseEntity.ok(bookPriceService.getOfferPriceById(bookId));
    }
}
