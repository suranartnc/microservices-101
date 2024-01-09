package com.suranartn.database.mappers.impl;

import com.suranartn.database.domain.dto.AuthorDto;
import com.suranartn.database.domain.dto.BookDto;
import com.suranartn.database.domain.entities.AuthorEntity;
import com.suranartn.database.domain.entities.BookEntity;
import com.suranartn.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements Mapper<BookEntity, BookDto> {
    private final ModelMapper modelMapper;

    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity book) {
        return modelMapper.map(book, BookDto.class);
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
