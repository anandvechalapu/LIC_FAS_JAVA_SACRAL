package com.lic.epgs.gstexcemption.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gst_excemption")
public class GstExcemption {
  
	@Id
	private String gstExcemptionId;
	private String clientId;
	private String gstNumber;
	private String gstExcempted;
	private String gstExcemptedDate;
	private String gstExcemptedReason;
	
	public String getGstExcemptionId() {
		return gstExcemptionId;
	}
	public void setGstExcemptionId(String gstExcemptionId) {
		this.gstExcemptionId = gstExcemptionId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getGstExcempted() {
		return gstExcempted;
	}
	public void setGstExcempted(String gstExcempted) {
		this.gstExcempted = gstExcempted;
	}
	public String getGstExcemptedDate() {
		return gstExcemptedDate;
	}
	public void setGstExcemptedDate(String gstExcemptedDate) {
		this.gstExcemptedDate = gstExcemptedDate;
	}
	public String getGstExcemptedReason() {
		return gstExcemptedReason;
	}
	public void setGstExcemptedReason(String gstExcemptedReason) {
		this.gstExcemptedReason = gstExcemptedReason;
	}
	
	
}