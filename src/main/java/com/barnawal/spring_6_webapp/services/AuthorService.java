package com.barnawal.spring_6_webapp.services;

import com.barnawal.spring_6_webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
