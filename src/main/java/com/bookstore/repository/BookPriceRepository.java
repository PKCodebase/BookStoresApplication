package com.bookstore.repository;

import com.bookstore.entity.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPriceRepository extends JpaRepository<BookPrice,Integer> {

}
