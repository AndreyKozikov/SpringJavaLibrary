package com.example.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    // Внедрение зависимости через конструктор
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Optional<Book> getBookById(UUID id) {
        return bookRepository.getBookById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public List<Book> updateBook(Book newBook) {
        return bookRepository.updateBook(newBook);
    }

    public List<Book> deleteBook(UUID id) {
        return bookRepository.deleteBook(id);
    }

}
