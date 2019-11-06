package com.ipigeon.app.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@CreationTimestamp
	LocalDateTime datetime;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	Sender sender;
	
	@OneToMany(mappedBy= "item", fetch = FetchType.LAZY)
	Set<Tracker> track;
	
	@OneToMany(mappedBy= "item", fetch = FetchType.LAZY)
	Set<Transaction> transactions;
	
	@NotNull(message = "*Please provide valid weight")
	double weight;
	
	@NotEmpty(message = "*Please provide content description")
	String content_description;
	
	String instructions; //for traveller
	
	@NotEmpty(message = "*Please provide receiver name")
	String receiver_name;
	
	@Pattern(regexp="^([1-9])\\d{9}", message = "*Please provide a valid contact number")
	String receiver_contact;
	
	@NotEmpty(message = "*Please provide address")
	String address_line1;
	String address_line2;
	@NotEmpty(message = "*Please provide City")
	String city;
	@NotEmpty(message = "*Please provide state")
	String state;
	@NotEmpty(message = "*Please provide country")
	String country;
	@NotEmpty(message = "*Please provide receiver name")
	String pincode;
	
	String receiver_image;
	String traveller_image;
	
	@NotNull(message = "*Please provide a valid price")
	double quoted_price;
	
//	String accepted_price;	//System can be extended to allow bidding.

	@UpdateTimestamp
	LocalDateTime udatetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public Set<Tracker> getTrack() {
		return track;
	}

	public void setTrack(Set<Tracker> track) {
		this.track = track;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getContent_description() {
		return content_description;
	}

	public void setContent_description(String content_description) {
		this.content_description = content_description;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_contact() {
		return receiver_contact;
	}

	public void setReceiver_contact(String receiver_contact) {
		this.receiver_contact = receiver_contact;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getReceiver_image() {
		return receiver_image;
	}

	public void setReceiver_image(String receiver_image) {
		this.receiver_image = receiver_image;
	}

	public String getTraveller_image() {
		return traveller_image;
	}

	public void setTraveller_image(String traveller_image) {
		this.traveller_image = traveller_image;
	}

	public double getQuoted_price() {
		return quoted_price;
	}

	public void setQuoted_price(double quoted_price) {
		this.quoted_price = quoted_price;
	}

	public LocalDateTime getUdatetime() {
		return udatetime;
	}

	public void setUdatetime(LocalDateTime udatetime) {
		this.udatetime = udatetime;
	}

	
	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	

	public Item() {
		super();
	}

	

	public Item(long id, Sender sender, Set<Tracker> track, Set<Transaction> transactions,
			@NotNull(message = "*Please provide valid weight") double weight,
			@NotEmpty(message = "*Please provide content description") String content_description, String instructions,
			@NotEmpty(message = "*Please provide receiver name") String receiver_name,
			@Pattern(regexp = "^([1-9])\\d{9}", message = "*Please provide a valid contact number") String receiver_contact,
			@NotEmpty(message = "*Please provide address") String address_line1, String address_line2,
			@NotEmpty(message = "*Please provide City") String city,
			@NotEmpty(message = "*Please provide state") String state,
			@NotEmpty(message = "*Please provide country") String country,
			@NotEmpty(message = "*Please provide receiver name") String pincode, String receiver_image,
			String traveller_image, @NotNull(message = "*Please provide a valid price") double quoted_price) {
		super();
		this.id = id;
		this.sender = sender;
		this.track = track;
		this.transactions = transactions;
		this.weight = weight;
		this.content_description = content_description;
		this.instructions = instructions;
		this.receiver_name = receiver_name;
		this.receiver_contact = receiver_contact;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.receiver_image = receiver_image;
		this.traveller_image = traveller_image;
		this.quoted_price = quoted_price;
	}

	public Item(Sender sender, Set<Tracker> track, Set<Transaction> transactions,
			@NotNull(message = "*Please provide valid weight") double weight,
			@NotEmpty(message = "*Please provide content description") String content_description, String instructions,
			@NotEmpty(message = "*Please provide receiver name") String receiver_name,
			@Pattern(regexp = "^([1-9])\\d{9}", message = "*Please provide a valid contact number") String receiver_contact,
			@NotEmpty(message = "*Please provide address") String address_line1, String address_line2,
			@NotEmpty(message = "*Please provide City") String city,
			@NotEmpty(message = "*Please provide state") String state,
			@NotEmpty(message = "*Please provide country") String country,
			@NotEmpty(message = "*Please provide receiver name") String pincode, String receiver_image,
			String traveller_image, @NotNull(message = "*Please provide a valid price") double quoted_price) {
		super();
		this.sender = sender;
		this.track = track;
		this.transactions = transactions;
		this.weight = weight;
		this.content_description = content_description;
		this.instructions = instructions;
		this.receiver_name = receiver_name;
		this.receiver_contact = receiver_contact;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.receiver_image = receiver_image;
		this.traveller_image = traveller_image;
		this.quoted_price = quoted_price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", datetime=" + datetime + ", sender=" + sender + ", track=" + track
				+ ", transactions=" + transactions + ", weight=" + weight + ", content_description="
				+ content_description + ", instructions=" + instructions + ", receiver_name=" + receiver_name
				+ ", receiver_contact=" + receiver_contact + ", address_line1=" + address_line1 + ", address_line2="
				+ address_line2 + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + ", receiver_image=" + receiver_image + ", traveller_image=" + traveller_image
				+ ", quoted_price=" + quoted_price + ", udatetime=" + udatetime + "]";
	}

	
	
	
	
}
