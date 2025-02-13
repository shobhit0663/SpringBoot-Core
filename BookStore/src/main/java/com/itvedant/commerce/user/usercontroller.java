package com.itvedant.commerce.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class usercontroller {
@Autowired
		private userservices us;
@PostMapping
public ResponseEntity<?> Signup( @RequestBody usersignup usp ){
	return ResponseEntity.ok(this.us.createS(usp));
}
@PostMapping("/signin")
public String signIn(@RequestParam("aName") String u, @RequestParam("aPass") String p) {
	return us.signIn(u, p);
}

}
