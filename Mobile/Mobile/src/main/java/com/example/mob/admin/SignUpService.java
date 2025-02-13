package com.example.mob.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SignUpService {

	@Autowired
	private SignUpInterface sui;
	
	public SignUp createS(SignUp su) {
		this.sui.save(su);
		return su;
	}
}
