package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsTemp;
import com.lic.epgs.customer.customermakercontroller.repository.SendforApproval_CustomerMakerControllerRepository;

@Service
public class SendforApproval_CustomerMakerControllerService {

    @Autowired
    private SendforApproval_CustomerMakerControllerRepository sendforApproval_CustomerMakerControllerRepository;

    public CustomerBasicDetailsTemp saveForApproval(CustomerBasicDetailsDto customerBasicDetailsDto) {
        return sendforApproval_CustomerMakerControllerRepository.saveForApproval(customerBasicDetailsDto);
    }
    
    public CustomerBasicDetailsDto findByCustomerId(Long customerId) {
        return sendforApproval_CustomerMakerControllerRepository.findByCustomerId(customerId);
    }
    
    public CustomerBasicDetailsTemp findByCustomerIdAndIsActive(Long customerId, boolean isActive) {
        return sendforApproval_CustomerMakerControllerRepository.findByCustomerIdAndIsActive(customerId, isActive);
    }

}