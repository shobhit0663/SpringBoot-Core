package com.example.mob.admin;

import java.util.List;

import com.example.mob.MobileB;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class SignUp {
		@Id
		private int id;
		@NotNull
		private String uName;
		@NotNull
		private String uPass;
		@NotNull
		private String email;
		@NotNull
		private String mobile;
		
		@OneToMany(mappedBy="signup", cascade=CascadeType.ALL)
		private List<MobileB> mobB;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getuName() {
			return uName;
		}

		public void setuName(String uName) {
			this.uName = uName;
		}

		public String getuPass() {
			return uPass;
		}

		public void setuPass(String uPass) {
			this.uPass = uPass;
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

		public List<MobileB> getMobB() {
			return mobB;
		}

		public void setMobB(List<MobileB> mobB) {
			this.mobB = mobB;
		}
	
		
		
}
