package com.barnawal.spring_6_webapp.services;

import com.barnawal.spring_6_webapp.domain.Book;
import com.barnawal.spring_6_webapp.repositories.BookRepository;
import lombok.Data;
import org.springframework.stereotype.Service;


@Service
@Data
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }


}












