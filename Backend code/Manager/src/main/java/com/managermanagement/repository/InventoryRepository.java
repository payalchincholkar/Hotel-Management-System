package com.managermanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.managermanagement.entity.InventoryEntity;

public interface InventoryRepository extends MongoRepository<InventoryEntity, Integer> {

}
