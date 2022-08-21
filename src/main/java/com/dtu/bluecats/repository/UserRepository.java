package com.dtu.bluecats.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dtu.bluecats.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
