package com.github.ruchir94.spring5webapp.repositories;

import com.github.ruchir94.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
