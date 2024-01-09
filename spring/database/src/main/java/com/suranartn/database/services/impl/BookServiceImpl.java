package com.suranartn.database.services.impl;

import com.suranartn.database.domain.entities.BookEntity;
import com.suranartn.database.repositories.BookRepository;
import com.suranartn.database.services.BookService;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
