package com.lic.epgs.lead.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lead_notes_active_temp")
public class LeadNotesActiveTempEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_notes_activity_id")
	private Long leadNotesActivityId;

	@Column(name = "lead_id")
	private Long leadId;

	@Column(name = "notes_activity")
	private String notesActivity;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "created_date")
	private Date createdDate;

}