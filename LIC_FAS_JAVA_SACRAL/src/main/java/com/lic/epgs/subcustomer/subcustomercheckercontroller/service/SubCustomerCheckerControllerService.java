package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.SubCustomerCheckerControllerRepository;

@Service
@Transactional
public class SubCustomerCheckerControllerService {

    @Autowired
    private SubCustomerCheckerControllerRepository repo;

    public SubCustomer findSubCustomerByCustomerId(Long customerId) {
        return repo.findSubCustomerByCustomerId(customerId);
    }

    public void updateSubCustomer(String address, String contact, String notes, String bankAccountDetails, Long customerId) {
        repo.updateSubCustomer(address, contact, notes, bankAccountDetails, customerId);
    }
}