package com.lic.epgs.customer.customercheckercontroller.service;

import org.springframework.http.ResponseEntity;
import com.lic.epgs.customer.customercheckercontroller.repository.CustomerCheckerControllerRepository;

public class CustomerCheckerControllerService {
 
    private CustomerCheckerControllerRepository customerCheckerControllerRepository;
 
    public CustomerCheckerControllerService(CustomerCheckerControllerRepository customerCheckerControllerRepository) {
        this.customerCheckerControllerRepository = customerCheckerControllerRepository;
    }
 
    public ResponseEntity<?> getMasterCustomerDetails(Long customerId) throws Exception {
        return customerCheckerControllerRepository.getMasterCustomerDetails(customerId);
    }
 
}