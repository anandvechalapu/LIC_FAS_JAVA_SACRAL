package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.repository.GetUnitCustomerMakerControllerRepository;

@Service
public class GetUnitCustomerMakerControllerService {

    @Autowired
    private GetUnitCustomerMakerControllerRepository getUnitCustomerMakerControllerRepository;

    public CustomerUnitOfficeDto getUnitCustomerMakerController(Integer customerId) {
        return getUnitCustomerMakerControllerRepository.findByCustomerId(customerId);
    }
}