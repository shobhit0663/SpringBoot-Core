package com.itvedant.commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartRepository repository;
	
	
	@PostMapping
	public ResponseEntity<?> addcart( @RequestBody Cart cart) {
		return ResponseEntity.ok(this.repository.save(cart));
	}
	
	@GetMapping
	public ResponseEntity<?> addcart() {
		return ResponseEntity.ok(this.repository.findAll());
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> addcart(@PathVariable Integer id) {
		return ResponseEntity.ok(this.repository.findById(id));
	}
}
