package com.javaee.jefferson.mongo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Garage {

	@Id
	private String id;
	private String name;
	private String address;
	private GasStation gasStation;
	
	@DBRef
	private List<Category> categories = new ArrayList<>();
	
	
}
