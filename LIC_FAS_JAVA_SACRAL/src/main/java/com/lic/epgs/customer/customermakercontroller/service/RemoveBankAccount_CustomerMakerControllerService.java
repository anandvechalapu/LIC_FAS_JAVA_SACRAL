package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.RemoveBankAccount_CustomerMakerController;
import com.lic.epgs.customer.customermakercontroller.repository.RemoveBankAccount_CustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveBankAccount_CustomerMakerControllerService {

    @Autowired
    private RemoveBankAccount_CustomerMakerControllerRepository removeBankAccount_customerMakerControllerRepository;

    public RemoveBankAccount_CustomerMakerController findByCustomerIdAndBankAccountId(Long customerId, Long bankAccountId) {
        return removeBankAccount_customerMakerControllerRepository.findByCustomerIdAndBankAccountId(customerId, bankAccountId);
    }

    public void deleteByCustomerIdAndBankAccountId(Long customerId, Long bankAccountId) {
        removeBankAccount_customerMakerControllerRepository.deleteByCustomerIdAndBankAccountId(customerId, bankAccountId);
    }

}