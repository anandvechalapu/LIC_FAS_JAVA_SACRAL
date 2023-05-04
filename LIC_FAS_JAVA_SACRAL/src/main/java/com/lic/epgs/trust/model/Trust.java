public class Trust {

    @Id
    private Long trustId;
    private Long documentId;
    private String role;

    public Trust() {
    }

    public Trust(Long trustId, Long documentId, String role) {
        this.trustId = trustId;
        this.documentId = documentId;
        this.role = role;
    }

    public Long getTrustId() {
        return trustId;
    }

    public void setTrustId(Long trustId) {
        this.trustId = trustId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trust")
public class Trust {

    @Id
    private Long trustId;
    private Long documentId;
    private String role;

    public Trust() {
    }

    public Trust(Long trustId, Long documentId, String role) {
        this.trustId = trustId;
        this.documentId = documentId;
        this.role = role;
    }

    public Long getTrustId() {
        return trustId;
    }

    public void setTrustId(Long trustId) {
        this.trustId = trustId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}