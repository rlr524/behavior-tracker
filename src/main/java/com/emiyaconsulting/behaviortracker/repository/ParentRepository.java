package com.emiyaconsulting.behaviortracker.repository;

import com.emiyaconsulting.behaviortracker.domain.Parent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parents", path = "parents")
public interface ParentRepository extends MongoRepository<Parent, String> {
}

