package com.bookstore.service.impl;

import com.bookstore.entity.BookPrice;
import com.bookstore.repository.BookPriceRepository;
import com.bookstore.service.BookPriceService;
import org.springframework.stereotype.Service;

@Service
public class BookPriceServiceImpl implements BookPriceService {

    private final BookPriceRepository bookPriceRepository;

    public BookPriceServiceImpl(BookPriceRepository bookPriceRepository) {
        this.bookPriceRepository = bookPriceRepository;
    }

    @Override
    public BookPrice getBookById(Integer bookId) {
         bookPriceRepository.findById(bookId).
                 orElseThrow(() -> new RuntimeException("Book not found"));
         return bookPriceRepository.findById(bookId).get();
    }

    @Override
    public double getOfferBookPriceById(Integer bookId) {
        return 0;
    }
}
