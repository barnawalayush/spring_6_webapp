package com.barnawal.spring_6_webapp.services;

import com.barnawal.spring_6_webapp.domain.Author;
import com.barnawal.spring_6_webapp.repositories.AuthorRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
