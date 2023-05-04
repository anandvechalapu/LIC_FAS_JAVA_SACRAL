package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubCustomerMakerController {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long subCustomerId;
	private String makerNote;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSubCustomerId() {
		return subCustomerId;
	}
	public void setSubCustomerId(long subCustomerId) {
		this.subCustomerId = subCustomerId;
	}
	public String getMakerNote() {
		return makerNote;
	}
	public void setMakerNote(String makerNote) {
		this.makerNote = makerNote;
	}

}