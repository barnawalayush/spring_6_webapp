package com.barnawal.spring_6_webapp.repositories;

import com.barnawal.spring_6_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
