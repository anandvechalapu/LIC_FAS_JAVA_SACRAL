package com.lic.epgs.lead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_activity_notes")
public class LeadActivityNotes {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	
	@Column(name="lead_id")
	private Long leadId;
	
	@Column(name="active_by")
	private String activeBy;
	
	@Column(name="active_date")
	private String activeDate;
	
	@Column(name="activity_type")
	private String activityType;
	
	@Column(name="activity_note_content")
	private String activityNoteContent;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="notes_content")
	private String notesContent;
	
	@Column(name="created_on")
	private String createdOn;
	
	@Column(name="active")
	private boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLeadId() {
		return leadId;
	}

	public void setLeadId(Long leadId) {
		this.leadId = leadId;
	}

	public String getActiveBy() {
		return activeBy;
	}

	public void setActiveBy(String activeBy) {
		this.activeBy = activeBy;
	}

	public String getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(String activeDate) {
		this.activeDate = activeDate;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityNoteContent() {
		return activityNoteContent;
	}

	public void setActivityNoteContent(String activityNoteContent) {
		this.activityNoteContent = activityNoteContent;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getNotesContent() {
		return notesContent;
	}

	public void setNotesContent(String notesContent) {
		this.notesContent = notesContent;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}