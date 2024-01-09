package com.suranartn.database.services;

import com.suranartn.database.domain.dto.BookDto;
import com.suranartn.database.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
