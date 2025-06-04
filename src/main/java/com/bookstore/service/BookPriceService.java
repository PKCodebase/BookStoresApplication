package com.bookstore.service;


import com.bookstore.entity.BookPrice;

public interface BookPriceService {


    BookPrice getBookById(Integer bookId);

    double getOfferPriceById(Integer bookId);
}
