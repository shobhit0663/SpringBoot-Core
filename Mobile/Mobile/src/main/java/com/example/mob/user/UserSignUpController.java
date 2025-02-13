package com.example.mob.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usersignup")
public class UserSignUpController {
		
	
	@Autowired
	private UserSignUpService us;
	
	@PostMapping("")
	public ResponseEntity<?> createsignup(@RequestBody UserSignUp usu) {
		return ResponseEntity.ok(this.us.createS(usu));
	}
}
