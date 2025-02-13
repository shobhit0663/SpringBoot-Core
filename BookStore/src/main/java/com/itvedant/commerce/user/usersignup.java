package com.itvedant.commerce.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
@Entity
public class usersignup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uId;
	@NotNull
	private String aName;
	@NotNull
	private String aPass;
	@NotNull
	private String email;
	@NotNull
	private String mobile;
	public int getId() {
		return uId;
	}
	public void setId(int uId) {
		this.uId = uId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaPass() {
		return aPass;
	}
	public void setaPass(String aPass) {
		this.aPass = aPass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
