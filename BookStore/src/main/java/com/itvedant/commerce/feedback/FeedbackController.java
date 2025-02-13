package com.itvedant.commerce.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.commerce.Book;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = "http://localhost:3000")
public class FeedbackController {
		
	@Autowired
	private FeedbackServices fbs;
	
	@PostMapping()	
	public ResponseEntity<?> createbook(@Valid @RequestBody Feedback fb) {
		return ResponseEntity.ok(this.fbs.createfeedback(fb));
	}
	
	
}
