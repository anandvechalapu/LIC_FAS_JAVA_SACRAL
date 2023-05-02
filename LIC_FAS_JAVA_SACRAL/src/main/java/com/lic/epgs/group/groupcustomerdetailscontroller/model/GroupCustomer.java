package com.lic.epgs.group.groupcustomerdetailscontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_customer")
public class GroupCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupCustomerId;
    
    private String name;
    
    private String address;
    
    private String status;
    
    // getters and setters
}