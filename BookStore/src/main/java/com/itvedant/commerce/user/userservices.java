package com.itvedant.commerce.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class userservices {
	@Autowired
	private userjpa uj;
	public usersignup createS(usersignup us) {
		this.uj.save(us);
		return us;
	}
	
	public String signIn(String u, String p) {
	    List<usersignup> signup = uj.findAll();
	    for (usersignup su : signup) {
	        if (u.equals(su.getaName())&& p.equals(su.getaPass())) {
	            return "Signed In. User ID: " + su.getId();
	        }
	    }
	    return "Failed: Invalid username or password.";
	}
	
	
}
