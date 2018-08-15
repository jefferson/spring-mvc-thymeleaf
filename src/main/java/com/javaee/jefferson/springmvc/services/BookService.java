package com.javaee.jefferson.springmvc.services;

import java.util.Set;

import com.javaee.jefferson.springmvc.domain.Book;


public interface BookService {

	Set<Book> getBooks();
	
	Book findById(Long id);
	
	Book saveBook(Book book);
	
	void deleteById(Long idToDelete);
	
}
