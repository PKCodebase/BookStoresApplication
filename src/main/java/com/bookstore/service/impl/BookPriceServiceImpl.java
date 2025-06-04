package com.bookstore.service.impl;

import com.bookstore.entity.BookPrice;
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
       BookPrice bookPrice =bookPriceRepository.findById(bookId).
               orElseThrow(() -> new RuntimeException("Book not found"));
         return bookPrice;
    }

    @Override
    public double getOfferBookPriceById(Integer bookId) {
        Optional<BookPrice> bookPriceOptional = bookPriceRepository.findById(bookId);
        double offeredPrice = 0.0;
        if (bookPriceOptional.isPresent()) {
            BookPrice bookPrice = bookPriceOptional.get();
            double actualPrice = bookPrice.getPrice();
            double offer = bookPrice.getOffer();
            double discount = actualPrice * (offer / 100);
            offeredPrice =  actualPrice - discount;

        }
        return offeredPrice;
    }
}
