package com.eclerx.day4.assignment;
import java.util.*;

public class Book implements Comparable<Book> {
    private long isbn;
    private String title;
    private double rating;
    private double price;
    private String source;

    public Book(long isbn, String title, double rating, double price, String source) {
        this.isbn = isbn;
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.source = source;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (isbn ^ (isbn >>> 32));
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }



    @Override
    public int compareTo(Book o) {
       return this.title.compareTo(o.title);
    }



    public long getIsbn() {
        return isbn;
    }



    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public double getRating() {
        return rating;
    }



    public void setRating(double rating) {
        this.rating = rating;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public String getSource() {
        return source;
    }



    public void setSource(String source) {
        this.source = source;
    }

    


    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", rating=" + rating + ", price=" + price + ", source="
                + source + "]";
    }



    public static List<Book> getFromAmazon() {
		Book b1 = new Book(9780596009201L, "Java 1", 4.0, 25.0, "Amazon");
		Book b2 = new Book(9780596009202L, "Java 2", 4.1, 25.0, "Amazon");
		Book b3 = new Book(9780596009203L, "Java 3", 4.5, 25.0, "Amazon");
		Book b4 = new Book(9780596009204L, "Java 4", 4.5, 25.0, "Amazon");
		Book b5 = new Book(9780596009205L, "Java 5", 3.9, 30.0, "Amazon");
		Book b6 = new Book(9780596009206L, "Java 6", 4.8, 40.0, "Amazon");
		Book b7 = new Book(9780596009207L, "Java 7", 4.9, 40.0, "Amazon");
		Book b8 = new Book(9780596009208L, "Java 8", 4.7, 50.0, "Amazon");
		Book b9 = new Book(9780596009209L, "Java 9", 4.3, 50.0, "Amazon");
		Book b10 = new Book(9780596009210L, "Java 10", 4.5, 60.0, "Amazon");
		
		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b7, b8, b9, b10);
	}

    public static List<Book> getFromBarnesAndNoble() {
		Book b1 = new Book(9780596009201L, "Java 1", 3.9, 20.0, "B&N");
		Book b2 = new Book(9780596009202L, "Java 2", 4.1, 20.0, "B&N");
		Book b3 = new Book(9780596009203L, "Java 3", 4.6, 20.0, "B&N");
		Book b4 = new Book(9780596009204L, "Java 4", 4.5, 20.0, "B&N");
		Book b5 = new Book(9780596009211L, "Java 11", 4.9, 40.0, "B&N");
		Book b6 = new Book(9780596009212L, "Java 12", 4.9, 55.0, "B&N");
		Book b7 = new Book(9780596009213L, "Java 13", 4.9, 60.0, "B&N");
		
		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7);
	}
}
