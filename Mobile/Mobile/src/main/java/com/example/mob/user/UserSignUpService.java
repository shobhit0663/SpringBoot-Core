package com.example.mob.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserSignUpService {
		@Autowired
		private UserSignUpInterface ui;
		
		public UserSignUp createS(UserSignUp us) {
			this.ui.save(us);
			return us;
		}
}
