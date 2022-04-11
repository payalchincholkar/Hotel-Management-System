package com.managermanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.managermanagement.entity.StaffEntity;

public interface StaffRepository extends MongoRepository<StaffEntity, String>{

}
