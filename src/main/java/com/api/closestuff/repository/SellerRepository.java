package com.api.closestuff.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.closestuff.model.Seller;

public interface SellerRepository extends MongoRepository<Seller, Integer>{

}
