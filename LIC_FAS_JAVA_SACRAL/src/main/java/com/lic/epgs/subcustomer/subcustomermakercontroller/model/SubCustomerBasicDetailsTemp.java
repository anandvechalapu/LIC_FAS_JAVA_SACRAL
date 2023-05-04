package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_customer_basic_details_temp")
public class SubCustomerBasicDetailsTemp {

    @Id
    private int id;
    private String status;
    private String workflow_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkflow_status() {
        return workflow_status;
    }

    public void setWorkflow_status(String workflow_status) {
        this.workflow_status = workflow_status;
    }
}