package com.lic.epgs.stampduty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveNotesDetails_STAMP_DUTY_10 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String jobTitle;
	private String dateOfHire;
	
	public SaveNotesDetails_STAMP_DUTY_10() {
		
	}
	
	public SaveNotesDetails_STAMP_DUTY_10(Long id, String name, String jobTitle, String dateOfHire) {
		this.id = id;
		this.name = name;
		this.jobTitle = jobTitle;
		this.dateOfHire = dateOfHire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	
	
	
}