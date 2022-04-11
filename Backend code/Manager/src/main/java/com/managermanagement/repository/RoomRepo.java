package com.managermanagement.repository;

import java.util.List;

import org.springframework.data.mongodb.core.aggregation.StringOperators.RegexFindAll;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.managermanagement.entity.RoomEntity;


public interface RoomRepo  extends MongoRepository<RoomEntity, Integer> {
 
}
