package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trust_document_details")
public class TrustDocumentDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long trustId;

  private String documentName;

  private String documentUrl;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getTrustId() {
    return this.trustId;
  }

  public void setTrustId(Long trustId) {
    this.trustId = trustId;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public String getDocumentUrl() {
    return this.documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

}