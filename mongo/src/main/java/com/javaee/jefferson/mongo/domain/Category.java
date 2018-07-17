package com.javaee.jefferson.mongo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {

	@Id
	private String id;
	private String description;
	
	@DBRef 
	private List<Garage> garages = new ArrayList<>();
	
}
