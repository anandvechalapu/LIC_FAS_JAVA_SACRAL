package com.lic.epgs.gstexcemption.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GST_EXCEMPTION")
public class GstExcemption {

	@Id
	@Column(name = "PROPOSAL_NUMBER")
	private String proposalNumber;

	@Column(name = "GST_POLICY_NUMBER")
	private String gstPolicyNumber;

	public GstExcemption() {
	}

	public GstExcemption(String proposalNumber, String gstPolicyNumber) {
		this.proposalNumber = proposalNumber;
		this.gstPolicyNumber = gstPolicyNumber;
	}

	public String getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public String getGstPolicyNumber() {
		return gstPolicyNumber;
	}

	public void setGstPolicyNumber(String gstPolicyNumber) {
		this.gstPolicyNumber = gstPolicyNumber;
	}

}

public class GstPolicyNumberDto {

	private String gstPolicyNumber;
	
	public GstPolicyNumberDto() {
	}
	
	public GstPolicyNumberDto(String gstPolicyNumber) {
		this.gstPolicyNumber = gstPolicyNumber;
	}
	
	public String getGstPolicyNumber() {
		return gstPolicyNumber;
	}

	public void setGstPolicyNumber(String gstPolicyNumber) {
		this.gstPolicyNumber = gstPolicyNumber;
	}
	
}