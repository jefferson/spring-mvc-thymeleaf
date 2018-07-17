package com.javaee.jefferson.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaee.jefferson.mongo.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

	
	
}
