package com.lic.epgs.commission.model;

import javax.persistence.*;

@Entity
@Table(name = "commission_question_details_temp_entity")
public class CommissionQuestionDetailsTempEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "inactive")
	private Boolean inactive;

	@Column(name = "commission_id")
	private Long commissionId;

	@Column(name = "details")
	private String details;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getInactive() {
		return inactive;
	}

	public void setInactive(Boolean inactive) {
		this.inactive = inactive;
	}

	public Long getCommissionId() {
		return commissionId;
	}

	public void setCommissionId(Long commissionId) {
		this.commissionId = commissionId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}