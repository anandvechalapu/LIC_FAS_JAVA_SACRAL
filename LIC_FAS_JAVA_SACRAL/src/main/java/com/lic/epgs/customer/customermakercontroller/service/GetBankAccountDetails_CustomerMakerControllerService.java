package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.dto.BankAccountDetailsDto;
import com.lic.epgs.customer.customermakercontroller.repository.GetBankAccountDetails_CustomerMakerControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetBankAccountDetails_CustomerMakerControllerService {

    @Autowired
    private GetBankAccountDetails_CustomerMakerControllerRepository getBankAccountDetails_customerMakerControllerRepository;

    public List<BankAccountDetailsDto> getBankAccountDetailsByCustomerId(Long customerId) {
        return getBankAccountDetails_customerMakerControllerRepository.getBankAccountDetailsByCustomerId(customerId);
    }

}