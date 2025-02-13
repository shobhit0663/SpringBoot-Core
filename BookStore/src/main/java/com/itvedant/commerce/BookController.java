package com.itvedant.commerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/bookapi")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
	
	@Autowired 
	private BookServices bsr;

	@PostMapping("/addbook")	
	public ResponseEntity<?> createbook(@Valid @RequestBody Book bk) {
		return ResponseEntity.ok(this.bsr.createBook(bk));
	}
	
    @PostMapping("/addAllbook")
	public ResponseEntity<?> createAllbook(@Valid @RequestBody List<Book> bk) {
		return ResponseEntity.ok(this.bsr.createAllBook(bk));
	}
	@GetMapping("/books")
	public ResponseEntity<?> showbooks(){
		return ResponseEntity.ok(this.bsr.showBooks());
	}
	
	@GetMapping("/getbook/{id}")
	public ResponseEntity<?> getClaim(@PathVariable Long id) throws Exception {
		return ResponseEntity.ok(this.bsr.getBook(id));
	}
	
	@PutMapping("/updatebook/{id}") 
	public ResponseEntity<?> updateClaim(@PathVariable Long id, @RequestBody Book br) throws Exception {
	return ResponseEntity.ok(this.bsr.updateBook(id, br));
	}
	
	@DeleteMapping("/deletebook/{id}")
	public void deleteClaim(@PathVariable Long id) throws Exception {
		this.bsr.deleteBook(id);
	}
	@DeleteMapping("/deleteAllbook")
	public void deleteAllBooks() {
	    // Logic to delete books
	    this.bsr.deleteAllbook();
	}
	
	
}
