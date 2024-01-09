package com.suranartn.database.services.impl;

import com.suranartn.database.domain.entities.AuthorEntity;
import com.suranartn.database.repositories.AuthorRepository;
import com.suranartn.database.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
