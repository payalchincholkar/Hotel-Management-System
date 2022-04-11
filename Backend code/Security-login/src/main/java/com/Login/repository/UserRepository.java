package com.Login.repository;


import com.Login.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
	
	UserModel findByUsername(String username);

}
