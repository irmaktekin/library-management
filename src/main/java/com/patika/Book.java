package com.patika;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private int id;

    @Column(name = "book_name",length = 100, nullable = false, unique = true)
    private String name;

    @Column(name=   "publication_year", nullable = false)
    private Integer publicationYear;

    @Column(name="stock_count", nullable = false)
    private Integer book_stock;

    public Integer getBook_stock() {
        return book_stock;
    }

    public void setBook_stock(Integer book_stock) {
        this.book_stock = book_stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

}
