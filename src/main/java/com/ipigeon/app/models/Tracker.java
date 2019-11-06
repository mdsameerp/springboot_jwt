package com.ipigeon.app.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Tracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@CreationTimestamp
	LocalDateTime datetime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	Item item;
	
	@Enumerated
	Status status;
	
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getUdatetime() {
		return udatetime;
	}

	public void setUdatetime(LocalDateTime udatetime) {
		this.udatetime = udatetime;
	}
	
	

	public Tracker() {
		super();
	}

	
	public Tracker(long id, Item item, Status status) {
		super();
		this.id = id;
		this.item = item;
		this.status = status;
	}
	
	

	public Tracker(Item item, Status status) {
		super();
		this.item = item;
		this.status = status;
	}
	
	

	public Tracker(long id, LocalDateTime datetime, Item item, Status status) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.item = item;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tracker [id=" + id + ", datetime=" + datetime + ", item=" + item + ", status=" + status + ", udatetime="
				+ udatetime + "]";
	}
	
	
	
	
	
}
