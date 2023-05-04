package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubCustomerMakerController {

    @Id
    private Long subCustomerId;
    private Long contactPersonId;
    private Boolean contactDetailStatus;
    private String successMessage;
    private String errorMessage;

    public Long getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(Long subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public Long getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(Long contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public Boolean getContactDetailStatus() {
        return contactDetailStatus;
    }

    public void setContactDetailStatus(Boolean contactDetailStatus) {
        this.contactDetailStatus = contactDetailStatus;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}