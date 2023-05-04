package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.ConfirmCustomerRejection_SubCustomerCheckerController2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfirmCustomerRejection_SubCustomerCheckerController2Controller {

    @Autowired
    private ConfirmCustomerRejection_SubCustomerCheckerController2Service service;

    @GetMapping("/customer")
    public Customer getCustomerById(@RequestParam Long customerId) {
        return service.getCustomerById(customerId);
    }

    @PutMapping("/customer")
    public void updateCustomerDetails(@RequestBody Customer customer) {
        service.updateCustomerDetails(customer);
    }

    @PutMapping("/customer/inactive")
    public void markCustomerAsInactive(@RequestParam Long customerId) {
        service.markCustomerAsInactive(customerId);
    }

    @PutMapping("/customer/response")
    public void sendResponseToUser() {
        service.sendResponseToUser();
    }

}