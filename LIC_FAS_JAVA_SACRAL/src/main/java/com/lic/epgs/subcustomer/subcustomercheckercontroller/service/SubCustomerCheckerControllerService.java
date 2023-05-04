package com.lic.epgs.subcustomer.subcustomercheckercontroller.service; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.SubCustomerCheckerControllerRepository; 
import com.lic.epgs.subcustomer.SubCustomer; 

@Service 
public class SubCustomerCheckerControllerService { 
 
    @Autowired 
    private SubCustomerCheckerControllerRepository subCustomerCheckerControllerRepository; 
 
    public boolean validateSubCustomerId(Long subCustomerId) { 
        return subCustomerCheckerControllerRepository.validateSubCustomerId(subCustomerId); 
    } 
 
    public boolean setSubCustomerStatusAndWorkflowStatus(Long subCustomerId, 
                                                         String newStatus, 
                                                         String newWorkflowStatus) { 
        return subCustomerCheckerControllerRepository.setSubCustomerStatusAndWorkflowStatus(subCustomerId, newStatus, newWorkflowStatus); 
    } 
 
    public boolean updateSubCustomerDetails(Long subCustomerId, 
                                            String newFirstName, 
                                            String newLastName, 
                                            String newAddress) { 
        return subCustomerCheckerControllerRepository.updateSubCustomerDetails(subCustomerId, newFirstName, newLastName, newAddress); 
    } 
 
    public boolean updateSubCustomerResponse(Long subCustomerId) { 
        return subCustomerCheckerControllerRepository.updateSubCustomerResponse(subCustomerId); 
    } 
 
    public SubCustomer createSubCustomer(SubCustomer subCustomer) { 
        return subCustomerCheckerControllerRepository.save(subCustomer); 
    } 
}