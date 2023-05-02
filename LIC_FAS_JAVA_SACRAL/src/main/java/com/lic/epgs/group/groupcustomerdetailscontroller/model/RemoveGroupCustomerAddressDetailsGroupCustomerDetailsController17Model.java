package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import org.springframework.http.ResponseEntity;

public class RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Model {

    private String groupCustomerId;
    private String addressId;
    private ResponseEntity<?> responseEntity;

    public RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Model() {

    }

    public String getGroupCustomerId() {
        return groupCustomerId;
    }

    public void setGroupCustomerId(String groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public ResponseEntity<?> getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(ResponseEntity<?> responseEntity) {
        this.responseEntity = responseEntity;
    }

}