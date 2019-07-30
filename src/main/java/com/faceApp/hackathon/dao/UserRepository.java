package com.faceApp.hackathon.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.faceApp.hackathon.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
