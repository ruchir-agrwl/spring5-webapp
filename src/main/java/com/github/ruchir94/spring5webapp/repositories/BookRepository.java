package com.github.ruchir94.spring5webapp.repositories;

import com.github.ruchir94.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
