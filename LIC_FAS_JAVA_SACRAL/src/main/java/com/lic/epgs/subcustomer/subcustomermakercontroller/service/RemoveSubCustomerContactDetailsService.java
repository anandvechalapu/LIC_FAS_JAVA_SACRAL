package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.RemoveSubCustomerContactDetailsRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.SubCustomerMakerController;

@Service
public class RemoveSubCustomerContactDetailsService {
    
    @Autowired
    private RemoveSubCustomerContactDetailsRepository removeSubCustomerContactDetailsRepository;
    
    public void removeSubCustomerContactDetails(Long subCustomerId, Long contactPersonId) {
        removeSubCustomerContactDetailsRepository.removeSubCustomerContactDetails(subCustomerId, contactPersonId);
    }
    
    public Boolean updateContactDetailsStatus(Long subCustomerId, Long contactPersonId) {
        return removeSubCustomerContactDetailsRepository.updateContactDetailsStatus(subCustomerId, contactPersonId);
    }
    
    public String getSuccessMessage(Long subCustomerId, Long contactPersonId) {
        return removeSubCustomerContactDetailsRepository.getSuccessMessage(subCustomerId, contactPersonId);
    }
    
    public String getErrorMessage(Long subCustomerId, Long contactPersonId) {
        return removeSubCustomerContactDetailsRepository.getErrorMessage(subCustomerId, contactPersonId);
    }

}