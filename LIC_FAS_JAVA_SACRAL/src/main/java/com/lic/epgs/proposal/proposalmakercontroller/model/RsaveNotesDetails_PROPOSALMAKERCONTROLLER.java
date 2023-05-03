package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rsave_notes_details_proposalmakercontroller")
public class RsaveNotesDetails_PROPOSALMAKERCONTROLLER {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="proposal_id")
	private Long proposalId;
	
	@Column(name="notes_details")
	private String notesDetails;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	private String createdDate;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="updated_date")
	private String updatedDate;

	public Long getProposalId() {
		return proposalId;
	}

	public void setProposalId(Long proposalId) {
		this.proposalId = proposalId;
	}

	public String getNotesDetails() {
		return notesDetails;
	}

	public void setNotesDetails(String notesDetails) {
		this.notesDetails = notesDetails;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

}