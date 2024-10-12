package com.example.library;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public class InMemoryBookRepository implements BookRepository{
    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAllBooks(){
        return books;
    }

    @Override
    public Optional<Book> getBookById (UUID id){
        return Optional.ofNullable(books.stream()
                .filter(book -> book.getId().equals(id)) //Фильтруем книги по id
                .findFirst(). //Находим первую подходящую книгу
                        orElse(null)); //Возращаем null, если книга не найдена
    }

    @Override
    public Book addBook (Book book){
        books.add(book);
        return book;
    }

    @Override
    public List<Book> updateBook (Book newBook) {
        UUID id = newBook.getId();
        books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .ifPresent(book -> {
                    book.setTitle(newBook.getTitle());
                    book.setAuthor(newBook.getAuthor());
                    book.setYear(newBook.getYear());
                    book.setIsbn(newBook.getIsbn());
                });
        return books;
    }

    @Override
    public List<Book> deleteBook(UUID id){
        books.removeIf(book -> book.getId().equals(id));
        return books;
    }
}
