package com.example.mob.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/signup")
public class SignUpController {

	@Autowired
	private SignUpService sus;
	
	
	
	@PostMapping("")
	public ResponseEntity<?> createsignup(@RequestBody SignUp suf) {
		return ResponseEntity.ok(this.sus.createS(suf));
	}
}
