package com.lic.epgs.customer.customermakercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "remove_unit_customer_maker_controller")
public class RemoveUnit_CustomerMakerController {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_unit_office_id")
    private Long customerUnitOfficeId;
    
    @Column(name = "customer_id")
    private Long customerId;
    
    public Long getCustomerUnitOfficeId(){
        return customerUnitOfficeId;
    }
    
    public void setCustomerUnitOfficeId(Long customerUnitOfficeId){
        this.customerUnitOfficeId = customerUnitOfficeId;
    }
    
    public Long getCustomerId(){
        return customerId;
    }
    
    public void setCustomerId(Long customerId){
        this.customerId = customerId;
    }
}