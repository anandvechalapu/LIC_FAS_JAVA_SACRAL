package com.lic.epgs.customer.customermakercontroller.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.ExistingCustomerSearch;
import com.lic.epgs.customer.customermakercontroller.service.ExistingCustomerSearch_CustomerMakerControllerService;

@RestController
@RequestMapping("/customer-maker-controller")
public class ExistingCustomerSearch_CustomerMakerControllerController {

    @Autowired
    ExistingCustomerSearch_CustomerMakerControllerService service;

    @GetMapping("/existing-customer/{roleType}/{unitCode}")
    public ExistingCustomerSearch getExistingCustomer(@PathVariable("roleType") String roleType, @PathVariable("unitCode") String unitCode) {
        return service.getExistingCustomer(roleType, unitCode);
    }

    @GetMapping("/existing-customers")
    public List<ExistingCustomerSearch> getAllExistingCustomers() {
        return service.getAllExistingCustomers();
    }

    @PostMapping("/existing-customer")
    public ExistingCustomerSearch createExistingCustomer(@RequestBody ExistingCustomerSearch existingCustomerSearch) {
        existingCustomerSearch.setModifiedDate(new Date());
        return service.createExistingCustomer(existingCustomerSearch);
    }
}