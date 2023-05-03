package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MPHAddressDetailsTempEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private MPHAddressDetailsDto addressDetailsDto;
	private String status;
	private String message;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MPHAddressDetailsDto getAddressDetailsDto() {
		return addressDetailsDto;
	}
	public void setAddressDetailsDto(MPHAddressDetailsDto addressDetailsDto) {
		this.addressDetailsDto = addressDetailsDto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}