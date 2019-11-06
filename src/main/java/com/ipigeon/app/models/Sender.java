package com.ipigeon.app.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Sender extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	
	
	@OneToMany(mappedBy= "sender", fetch = FetchType.LAZY)
	Set<Item> items;

	
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	

	public Set<Item> getItem() {
		return items;
	}


	public void setItem(Set<Item> items) {
		this.items = items;
	}


	public Sender() {
		super();
	}


	public Sender(long id, Set<Item> items) {
		super();
		this.id = id;
		this.items = items;
	}


	public Sender(Long id, @NotEmpty(message = "*Please provide First Name") String fname, String lname, String email,
			@Pattern(regexp = "^([1-9])\\d{9}", message = "*Please provide a valid contact number") String contact,
			String password, String line1, String line2, String city, String state, String country, String pincode,
			int active, int otp, boolean verified, Set<Role> roles) {
		super(id, fname, lname, email, contact, password, line1, line2, city, state, country, pincode, active, otp, verified,
				roles);
		// TODO Auto-generated constructor stub
	}


	public Sender(Long id, @NotEmpty(message = "*Please provide First Name") String fname, String lname, String email,
			@Pattern(regexp = "^([1-9])\\d{9}", message = "*Please provide a valid contact number") String contact,
			String password, String line1, String line2, String city, String state, String country, String pincode,
			int active, int otp, boolean verified) {
		super(id, fname, lname, email, contact, password, line1, line2, city, state, country, pincode, active, otp, verified);
		// TODO Auto-generated constructor stub
	}


	public Sender(@NotEmpty(message = "*Please provide First Name") String fname, String lname, String email,
			@Pattern(regexp = "^([1-9])\\d{9}", message = "*Please provide a valid contact number") String contact,
			String password, String line1, String line2, String city, String state, String country, String pincode,
			int active, int otp, boolean verified, Set<Role> roles) {
		super(fname, lname, email, contact, password, line1, line2, city, state, country, pincode, active, otp, verified,
				roles);
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
	
}
