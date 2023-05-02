package com.lic.epgs.customer.customermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerMakerController {

    @Id
    private Long id;
    private String customerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}