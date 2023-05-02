// Spring Boot Controller Class
package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerAddressDetails;
import com.lic.epgs.customer.customermakercontroller.service.AddCustomerAddressDetails_CustomerMakerControllerService;

@RestController
@RequestMapping("/customer-maker-controller/customer-address-details")
public class AddCustomerAddressDetails_CustomerMakerController {

    @Autowired
    private AddCustomerAddressDetails_CustomerMakerControllerService service;

    @PostMapping
    public CustomerAddressDetails save(@RequestBody CustomerAddressDetails customerAddressDetails) {
        return service.save(customerAddressDetails);
    }

    @GetMapping("/{customerId}")
    public CustomerAddressDetails findByCustomerId(@PathVariable Long customerId) {
        return service.findByCustomerId(customerId);
    }

    @DeleteMapping("/{customerId}")
    public void deleteByCustomerId(@PathVariable Long customerId) {
        service.deleteByCustomerId(customerId);
    }

}