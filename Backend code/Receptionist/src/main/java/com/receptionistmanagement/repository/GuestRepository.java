package com.receptionistmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.receptionistmanagement.entity.GuestEntity;

public interface GuestRepository extends MongoRepository<GuestEntity, Integer>{

}
