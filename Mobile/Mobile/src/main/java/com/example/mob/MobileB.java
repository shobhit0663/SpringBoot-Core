package com.example.mob;

import com.example.mob.admin.SignUp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MobileB {
	@Id
	private int id;
	private String mName;
	private String mBrand;
	private double price;
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public SignUp getSignup() {
		return signup;
	}
	public void setSignup(SignUp signup) {
		this.signup = signup;
	}
	@ManyToOne
	@JoinColumn(name = "admin_id",nullable=false)
	private SignUp signup;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmBrand() {
		return mBrand;
	}
	public void setmBrand(String mBrand) {
		this.mBrand = mBrand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
