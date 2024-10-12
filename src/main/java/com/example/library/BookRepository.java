package com.example.library;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepository {
    List<Book> getAllBooks();
    Optional<Book> getBookById (UUID id);
    Book addBook (Book book);
    List<Book> updateBook (Book newBook);
    List<Book> deleteBook(UUID id);

}
