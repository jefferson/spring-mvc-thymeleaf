package com.javaee.jefferson.mongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.jefferson.mongo.domain.Garage;

@Repository
public interface GarageRepository extends MongoRepository<Garage, String>{

	List<Garage> findByName(String name);
	
}
