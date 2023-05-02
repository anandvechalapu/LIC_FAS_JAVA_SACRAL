package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerCheckerControllerRepository {
 
    public ResponseEntity<?> getMasterCustomerDetails(Long customerId) throws Exception {
        // Get Customer details from db
        return ResponseEntity.ok("Success");
    }
 
}


package com.lic.epgs.customer.customercheckercontroller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.service.CustomerCheckerControllerService;

@RestController
public class CustomerCheckerController {

    private CustomerCheckerControllerService customerCheckerControllerService;
 
    public CustomerCheckerController(CustomerCheckerControllerService customerCheckerControllerService) {
        this.customerCheckerControllerService = customerCheckerControllerService;
    }
 
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getMasterCustomerDetails(@PathVariable("customerId") Long customerId) throws Exception {
        return customerCheckerControllerService.getMasterCustomerDetails(customerId);
    }
}