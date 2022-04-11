package com.owner.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.owner.entity.Details;

public interface OwnerRepo extends MongoRepository<Details, Integer> {


}
