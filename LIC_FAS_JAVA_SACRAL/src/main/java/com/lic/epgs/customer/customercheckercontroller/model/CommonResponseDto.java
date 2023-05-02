package com.lic.epgs.customer.customercheckercontroller.model;

public class CommonResponseDto {

    private String status;
    private String message;
    private Object data;

    public CommonResponseDto(){
    }

    public CommonResponseDto(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class CustomerBasicDetailsDto {

    private String customerName;
    private String customerId;
    private String reasonForRejection;

    public CustomerBasicDetailsDto(){
    }

    public CustomerBasicDetailsDto(String customerName, String customerId, String reasonForRejection) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.reasonForRejection = reasonForRejection;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getReasonForRejection() {
        return reasonForRejection;
    }

    public void setReasonForRejection(String reasonForRejection) {
        this.reasonForRejection = reasonForRejection;
    }

}