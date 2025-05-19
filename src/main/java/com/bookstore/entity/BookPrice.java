package com.bookstore.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "book_price")
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_Id")
    private Integer bookId;

    @Column(name = "book_price")
    private Double price;

    @Column(name = "offer")
    private Double offer;

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
