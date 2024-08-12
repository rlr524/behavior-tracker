package com.emiyaconsulting.behaviortracker.repository;

import com.emiyaconsulting.behaviortracker.domain.Child;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "children", path = "children")
public interface ChildRepository extends MongoRepository<Child, String> {
}
