package com.javaee.jefferson.springmvc.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.javaee.jefferson.springmvc.domain.Book;

@Service
public class BookServiceImpl implements BookService {

	private Set<Book> bookSaved = new HashSet<>();
	private Long actualId = 0L;
	
	@Override
	public Set<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookSaved;
	}

	@Override
	public Book findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Book> bookOptional = bookSaved.stream().filter(book -> book.getId().equals(id)).findFirst();
		
		return bookOptional.orElse(null);
		
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		if(book.getId() != null)
		{
			this.deleteById(book.getId());
		}
		else
		{
			actualId++;
			book.setId(actualId);
		}
		
		this.bookSaved.add(book);
		
		return book;
	}

	@Override
	public void deleteById(Long idToDelete) {
		// TODO Auto-generated method stub
		this.bookSaved.removeIf( book -> book.getId().equals(idToDelete));
	}

}
