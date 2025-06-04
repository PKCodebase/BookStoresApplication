package com.bookstore.service.impl;

import com.bookstore.entity.BookPrice;
import com.bookstore.exception.ResourceNotFoundException;
import com.bookstore.repository.BookPriceRepository;
import com.bookstore.service.BookPriceService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookPriceServiceImpl implements BookPriceService {

    private final BookPriceRepository bookPriceRepository;

    public BookPriceServiceImpl(BookPriceRepository bookPriceRepository) {
        this.bookPriceRepository = bookPriceRepository;
    }

    @Override
    public BookPrice getBookById(Integer bookId) {
        return bookPriceRepository.findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("Book with ID " + bookId + " not found"));
    }

    @Override
    public double getOfferPriceById(Integer bookId) {
        BookPrice bookPrice = bookPriceRepository.findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("No any offer available with " + bookId ));

        double actualPrice = bookPrice.getPrice();
        double offer = bookPrice.getOffer();
        double discount = actualPrice * (offer / 100);
        return actualPrice - discount;
    }
}
