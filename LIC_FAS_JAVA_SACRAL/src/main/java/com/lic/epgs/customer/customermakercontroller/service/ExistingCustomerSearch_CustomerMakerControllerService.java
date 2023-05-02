package com.lic.epgs.customer.customermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.ExistingCustomerSearch;
import com.lic.epgs.customer.customermakercontroller.repository.ExistingCustomerSearch_CustomerMakerControllerRepository;

@Service
public class ExistingCustomerSearch_CustomerMakerControllerService {

    @Autowired
    ExistingCustomerSearch_CustomerMakerControllerRepository repository;

    public ExistingCustomerSearch getExistingCustomer(String roleType, String unitCode) {
        return repository.getExistingCustomer(roleType, unitCode);
    }

    public List<ExistingCustomerSearch> getAllExistingCustomers() {
        return repository.findAll();
    }

}