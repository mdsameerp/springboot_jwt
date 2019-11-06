package com.ipigeon.app.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@CreationTimestamp
	LocalDateTime datetime;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	Item item;
	
	long debit_acc_id;  // (sender id)
	long credit_acc_id; // (traveler_id or ipegion id =0)
	
	double amount;
	String description;
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public long getDebit_acc_id() {
		return debit_acc_id;
	}
	public void setDebit_acc_id(long debit_acc_id) {
		this.debit_acc_id = debit_acc_id;
	}
	public long getCredit_acc_id() {
		return credit_acc_id;
	}
	public void setCredit_acc_id(long credit_acc_id) {
		this.credit_acc_id = credit_acc_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getUdatetime() {
		return udatetime;
	}
	public void setUdatetime(LocalDateTime udatetime) {
		this.udatetime = udatetime;
	}
	
	
	
	public Transaction() {
		super();
	}
	
	
	public Transaction(long id, Item item, long debit_acc_id, long credit_acc_id, double amount, String description) {
		super();
		this.id = id;
		this.item = item;
		this.debit_acc_id = debit_acc_id;
		this.credit_acc_id = credit_acc_id;
		this.amount = amount;
		this.description = description;
	}
	
	
	public Transaction(long id, LocalDateTime datetime, Item item, long debit_acc_id, long credit_acc_id, double amount,
			String description) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.item = item;
		this.debit_acc_id = debit_acc_id;
		this.credit_acc_id = credit_acc_id;
		this.amount = amount;
		this.description = description;
	}
	
	
	
	public Transaction(Item item, long debit_acc_id, long credit_acc_id, double amount, String description) {
		super();
		this.item = item;
		this.debit_acc_id = debit_acc_id;
		this.credit_acc_id = credit_acc_id;
		this.amount = amount;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", datetime=" + datetime + ", item=" + item + ", debit_acc_id=" + debit_acc_id
				+ ", credit_acc_id=" + credit_acc_id + ", amount=" + amount + ", description=" + description
				+ ", udatetime=" + udatetime + "]";
	}

	
	
}
