package com.itvedant.commerce;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class BookServices {
	@Autowired
	private BookRepository br;
	
	public Book createBook(Book bk) {
		this.br.save(bk);
		return bk;
	} 
	
	public List<Book> createAllBook(List<Book> bk) {
		this.br.saveAll(bk);
		return bk;
	} 
	public List<Book> showBooks() {
		return this.br.findAll();
	}
	
	public Book getBook(Long id) throws Exception {
		Book bk =  this.br.findById(id).orElse(null);
		if(bk==null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't Exist");
		}
		return bk;
	}
	
	public Book updateBook(Long id,Book cm) throws Exception {
		Book bk =  this.br.findById(id).orElse(null);
		if(bk==null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't Exist");
		}
		else {
			bk.setAuthor(cm.getAuthor());	
			bk.setCoverPhotoURL(cm.getCoverPhotoURL());
			bk.setIsbnNumber(cm.getIsbnNumber());
			bk.setLanguage(cm.getLanguage());
			bk.setPrice(cm.getPrice());
			bk.setTitle(cm.getTitle());
			this.br.save(bk);
		}
			return bk;
	}
	
	public void deleteBook(Long id) {
		br.deleteById(id);
	}
	public void deleteAllbook() {
	br.deleteAll();
	}
}
