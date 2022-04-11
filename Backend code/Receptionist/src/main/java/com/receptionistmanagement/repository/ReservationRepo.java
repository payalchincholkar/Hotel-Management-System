package com.receptionistmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.receptionistmanagement.entity.ReservationEntity;


public interface ReservationRepo extends MongoRepository<ReservationEntity, Long> {

}
