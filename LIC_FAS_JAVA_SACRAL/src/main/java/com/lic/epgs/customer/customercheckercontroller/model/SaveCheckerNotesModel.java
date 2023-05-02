package com.lic.epgs.customer.customercheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "save_checker_notes")
public class SaveCheckerNotesModel {

	private Long id;
	
	private String notes;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}