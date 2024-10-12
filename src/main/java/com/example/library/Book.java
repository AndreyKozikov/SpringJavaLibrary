package com.example.library;

import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class Book {
    private UUID id;
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(UUID id, String title, String author, int year, String isbn) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public Book() {
    }

    public UUID getId() {
        return (UUID) id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, year, isbn);
    }
}
