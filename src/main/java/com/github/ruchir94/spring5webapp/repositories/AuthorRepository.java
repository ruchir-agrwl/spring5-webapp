package com.github.ruchir94.spring5webapp.repositories;

import com.github.ruchir94.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
