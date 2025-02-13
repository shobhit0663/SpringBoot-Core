package com.itvedant.commerce.feedback;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity 	 	 
public class Feedback {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @NotNull
  private String name;
  @NotNull
  private String email;
  @NotNull
  private String message;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
