package com.itvedant.commerce.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServices {
		
	@Autowired
	private FeedbackRepository fr;
	
	public Feedback createfeedback(Feedback fb) {
		this.fr.save(fb);
		return fb;
	}
}
