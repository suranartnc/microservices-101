package com.suranartn.database.services;

import com.suranartn.database.domain.entities.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);

    Page<BookEntity> findAll(Pageable pageable);
}
