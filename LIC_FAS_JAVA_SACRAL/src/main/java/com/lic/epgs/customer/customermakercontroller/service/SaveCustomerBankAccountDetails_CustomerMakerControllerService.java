package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.entity.CustomerBankAccountDetails;
import com.lic.epgs.customer.customermakercontroller.repository.SaveCustomerBankAccountDetails_CustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCustomerBankAccountDetails_CustomerMakerControllerService {

    @Autowired
    SaveCustomerBankAccountDetails_CustomerMakerControllerRepository saveCustomerBankAccountDetails_customerMakerControllerRepository;

    public CommonResponseDto saveCustomerBankAccountDetails(CustomerBankAccountDetails customerBankAccountDetails){
        return saveCustomerBankAccountDetails_customerMakerControllerRepository.saveCustomerBankAccountDetails(customerBankAccountDetails);
    }
}