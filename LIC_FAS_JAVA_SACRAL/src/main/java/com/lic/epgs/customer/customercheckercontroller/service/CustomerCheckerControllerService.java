package com.lic.epgs.customer.customercheckercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customercheckercontroller.model.Customer;
import com.lic.epgs.customer.customercheckercontroller.repository.CustomerCheckerControllerRepository;

@Service
public class CustomerCheckerControllerService {

    @Autowired
    private CustomerCheckerControllerRepository customerCheckerControllerRepository;

    public Customer getCustomer(Long customerId) {
        return customerCheckerControllerRepository.findByCustomerId(customerId);
    }

    public Customer getCustomer(Long customerId, String trustCode) {
        return customerCheckerControllerRepository.findByCustomerIdAndTrustCode(customerId, trustCode);
    }

    public Customer getCustomer(Long customerId, String trustCode, String trustName) {
        return customerCheckerControllerRepository.findByCustomerIdAndTrustCodeAndTrustName(customerId, trustCode, trustName);
    }

    public List<Customer> getAllCustomers() {
        return customerCheckerControllerRepository.findAll();
    }

}