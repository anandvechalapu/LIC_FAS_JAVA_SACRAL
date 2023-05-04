package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.ConfirmCustomerRejection_SubCustomerCheckerController2Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfirmCustomerRejection_SubCustomerCheckerController2Service {

    @Autowired
    private ConfirmCustomerRejection_SubCustomerCheckerController2Repository repository;

    public Customer getCustomerById(Long customerId) {
        return repository.findByCustomerId(customerId);
    }

    public void updateCustomerDetails(Customer customer) {
        repository.updateCustomerDetails(customer);
    }

    public void markCustomerAsInactive(Long customerId) {
        repository.markCustomerAsInactive(customerId);
    }

    public void sendResponseToUser() {
        repository.sendResponseToUser();
    }

}