package com.lic.epgs.notifydomain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NotifyDomainModel {
	
	@Id
	private Long id;
	private String demandNo;
	private String collectionNo;
	private String refNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}
	public String getCollectionNo() {
		return collectionNo;
	}
	public void setCollectionNo(String collectionNo) {
		this.collectionNo = collectionNo;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
	

}