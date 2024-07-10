package com.patika;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;

    @ManyToOne
    @JoinColumn(name="book_author_id", referencedColumnName ="author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name="book_publisher_id", referencedColumnName ="publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> bookBorrowings;


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
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", book_stock=" + book_stock +
                '}';
    }

}
