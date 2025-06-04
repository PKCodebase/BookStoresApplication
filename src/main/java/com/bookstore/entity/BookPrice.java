package com.bookstore.entity;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "book_price")
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_Id")
    private Integer bookId;

    @Column(name = "book_price")
    @Schema(description = "Book Price", example = "kaushik Prasad")
    private Double price;

    @Column(name = "offer")
    @Schema(name = "offer", example = "10%")
    private Double offer;

    public BookPrice(Double offer, Double price, Integer bookId) {
        this.offer = offer;
        this.price = price;
        this.bookId = bookId;
    }

    public BookPrice() {
    }

    public BookPrice(Double offer, Double price) {
        this.offer = offer;
        this.price = price;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }
}
