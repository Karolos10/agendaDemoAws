package com.example.demoaws.repository;

import com.example.demoaws.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contacts", collectionResourceRel = "contacts")
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
