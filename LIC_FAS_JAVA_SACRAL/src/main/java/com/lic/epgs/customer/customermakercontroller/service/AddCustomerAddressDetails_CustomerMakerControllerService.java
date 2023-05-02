// Spring Boot Service Class
package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerAddressDetails;
import com.lic.epgs.customer.customermakercontroller.repository.AddCustomerAddressDetails_CustomerMakerControllerRepository;

@Service
public class AddCustomerAddressDetails_CustomerMakerControllerService {

    @Autowired
    private AddCustomerAddressDetails_CustomerMakerControllerRepository repository;

    public CustomerAddressDetails save(CustomerAddressDetails customerAddressDetails) {
        return repository.save(customerAddressDetails);
    }

    public CustomerAddressDetails findByCustomerId(Long customerId) {
        return repository.findByCustomerId(customerId);
    }

    public void deleteByCustomerId(Long customerId) {
        repository.deleteByCustomerId(customerId);
    }

}