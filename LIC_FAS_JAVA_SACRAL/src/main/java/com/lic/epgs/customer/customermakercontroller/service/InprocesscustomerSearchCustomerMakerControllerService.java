package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.repository.InprocesscustomerSearchCustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InprocesscustomerSearchCustomerMakerControllerService {

    @Autowired
    private InprocesscustomerSearchCustomerMakerControllerRepository inprocesscustomerSearchCustomerMakerControllerRepository;
    
    public CommonResponseDto getInprocessCustomerSearch(String roleType, String unitCode, String customerName, String trustCode, String trustName){
        return inprocesscustomerSearchCustomerMakerControllerRepository.getInprocessCustomerSearch(roleType, unitCode, customerName, trustCode, trustName);
    }
}