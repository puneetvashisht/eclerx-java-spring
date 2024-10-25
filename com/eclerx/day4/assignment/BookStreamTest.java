package com.eclerx.day4.assignment;

import java.util.*;
import java.util.stream.*;

public class BookStreamTest {
    public static void main(String[] args) {
        List<Book> booksFromAmazon = Book.getFromAmazon();
        List<Book> booksFromBN = Book.getFromBarnesAndNoble();

        List<Book> books = new ArrayList<>();
        books.addAll(booksFromAmazon);
        books.addAll(booksFromBN);


        // Stream pipeline common structure
        // (a) set-up stream source (tables in sql)
        // (b) 0 or more intermediate operation (~WHERE clause) -- lazy return stream back
        // (c) terminal operation (~ column names) - eager

        // 1. Print all the books from Amazon and B&N
        // books.stream()
        // .forEach((e)->System.out.println(e));

        // 2. Filter all books having rating > 4.5
        // books.stream()
        // .filter((b) -> b.getRating() > 4.5)
        // .forEach((e)->System.out.println(e));
        // 3. Skip, limit and distinct

        TreeSet<Book> filteredBooks = books.parallelStream()
        .filter((b) -> b.getRating() > 4.5 && b.getPrice() > 30)
        // .toList();
        .collect(Collectors.toCollection(()-> new TreeSet<>()));

        // System.out.println(filteredBooks);
        for(Book b : filteredBooks){
            System.out.println(b);
        }
        // .skip(2)
        // .limit(5)
        // .forEach((e)->System.out.println(e));

        // 4. Print price of all the books
        // books.stream()
        // .map(b -> b.getPrice())
        // .forEach(b -> System.out.println(b));


        // boolean result = books.stream()
        // // .anyMatch((b) -> b.getRating() > 4.5 && b.getPrice() > 100);
        // .noneMatch((b) -> b.getRating() > 4.5 );
        // System.out.println("Is thr any match" + result);
        
    }
}
