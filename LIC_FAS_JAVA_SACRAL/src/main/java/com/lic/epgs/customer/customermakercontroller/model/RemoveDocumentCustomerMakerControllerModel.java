package com.lic.epgs.customer.customermakercontroller.model;

import org.springframework.http.ResponseEntity;

public class RemoveDocumentCustomerMakerControllerModel {

    private Long documentId;
    private Long customerId;

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
}