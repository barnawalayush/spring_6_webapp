package com.barnawal.spring_6_webapp.services;

import com.barnawal.spring_6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
