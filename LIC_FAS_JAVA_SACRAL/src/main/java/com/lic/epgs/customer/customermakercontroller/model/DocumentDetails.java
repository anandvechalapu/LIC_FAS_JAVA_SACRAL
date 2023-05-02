package com.lic.epgs.customer.customermakercontroller.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document_details")
public class DocumentDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	private Long documentId;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "document_name")
	private String documentName;

	@Column(name = "document_number")
	private String documentNumber;

	@Column(name = "document_type")
	private String documentType;

	@Column(name = "document_expiry_date")
	private String documentExpiryDate;

	public Long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentExpiryDate() {
		return documentExpiryDate;
	}

	public void setDocumentExpiryDate(String documentExpiryDate) {
		this.documentExpiryDate = documentExpiryDate;
	}

}