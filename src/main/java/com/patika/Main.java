package com.patika;

import javax.persistence.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

       /* Author author = new Author();
        author.setBirthDate(new Date(20,8,5));
        author.setName("Authoer1");
        author.setCountry("Turkey");
        entityManager.persist(author);

        entityTransaction.begin();
        Book book1 = new Book();
        book1.setName("Book1");
        book1.setBook_stock(20);
        book1.setPublicationYear(2023);
        book1.setAuthor(author);
        entityManager.persist(book1);
        */

    }
}