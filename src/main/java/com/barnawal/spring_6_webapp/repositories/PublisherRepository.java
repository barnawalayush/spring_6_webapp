package com.barnawal.spring_6_webapp.repositories;

import com.barnawal.spring_6_webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
}
