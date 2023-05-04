package com.lic.epgs.subcustomer.subcustomercheckercontroller.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
 
@Repository 
public interface SubCustomerCheckerControllerRepository extends JpaRepository<SubCustomer, Long> { 
 
    // Method to validate the sub customer ID 
    boolean validateSubCustomerId(Long subCustomerId); 
 
    // Method to set the sub customer status and workflow status to the new values 
    boolean setSubCustomerStatusAndWorkflowStatus(Long subCustomerId, 
                                                  String newStatus, 
                                                  String newWorkflowStatus); 
 
    // Method to update the customer details associated with the sub customer 
    boolean updateSubCustomerDetails(Long subCustomerId, 
                                     String newFirstName, 
                                     String newLastName, 
                                     String newAddress); 
 
    // Method to return a response indicating the success or failure of the update 
    boolean updateSubCustomerResponse(Long subCustomerId); 
}