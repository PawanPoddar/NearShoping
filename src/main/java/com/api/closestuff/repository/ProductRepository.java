package com.api.closestuff.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.closestuff.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{
	@Query("{id : ?0}")
	Product findId(int id);
	List<Product> findByIdOrName(int id,String name);
//	
	

}
