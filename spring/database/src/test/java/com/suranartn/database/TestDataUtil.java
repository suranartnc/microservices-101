package com.suranartn.database;

import com.suranartn.database.domain.Author;
import com.suranartn.database.domain.Book;

public final class TestDataUtil {
    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Book createTestBook(final Author author) {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .author(author)
                .build();
    }
}
