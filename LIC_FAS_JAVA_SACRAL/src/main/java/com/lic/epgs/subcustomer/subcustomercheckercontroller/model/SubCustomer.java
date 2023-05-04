package com.lic.epgs.subcustomer.subcustomercheckercontroller.model; 
 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 

@Entity 
public class SubCustomer { 
 
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long subCustomerId; 
    private String firstName; 
    private String lastName; 
    private String address; 
    private String status; 
    private String workflowStatus; 
 
    public SubCustomer() { 
    } 
 
    public SubCustomer(Long subCustomerId, 
                       String firstName, 
                       String lastName, 
                       String address, 
                       String status, 
                       String workflowStatus) { 
        this.subCustomerId = subCustomerId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.address = address; 
        this.status = status; 
        this.workflowStatus = workflowStatus; 
    } 
 
    public Long getSubCustomerId() { 
        return subCustomerId; 
    } 
 
    public void setSubCustomerId(Long subCustomerId) { 
        this.subCustomerId = subCustomerId; 
    } 
 
    public String getFirstName() { 
        return firstName; 
    } 
 
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    } 
 
    public String getLastName() { 
        return lastName; 
    } 
 
    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    } 
 
    public String getAddress() { 
        return address; 
    } 
 
    public void setAddress(String address) { 
        this.address = address; 
    } 
 
    public String getStatus() { 
        return status; 
    } 
 
    public void setStatus(String status) { 
        this.status = status; 
    } 
 
    public String getWorkflowStatus() { 
        return workflowStatus; 
    } 
 
    public void setWorkflowStatus(String workflowStatus) { 
        this.workflowStatus = workflowStatus; 
    } 
}