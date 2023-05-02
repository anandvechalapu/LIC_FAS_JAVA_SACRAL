package com.lic.epgs.customer.customermakercontroller.service;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerEntity;
import com.lic.epgs.customer.customermakercontroller.repository.SearchMemberCustomerDetailsCustomerMakerControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchMemberCustomerDetailsCustomerMakerControllerService {

    @Autowired
    private SearchMemberCustomerDetailsCustomerMakerControllerRepository searchMemberCustomerDetailsCustomerMakerControllerRepository;

    public Optional<List<CustomerEntity>> findByCustomerCodeAndCustomerNameAndTrustName(String customerCode, 
                                                                                        String customerName,
                                                                                        String trustName ) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerCodeAndCustomerNameAndTrustName(customerCode, 
                                                                                                                       customerName,
                                                                                                                       trustName);
    }

    public Optional<List<CustomerEntity>> findByCustomerNameAndTrustName(String customerName, 
                                                                        String trustName) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerNameAndTrustName(customerName, 
                                                                                                         trustName);
    }

    public Optional<List<CustomerEntity>> findByCustomerCodeAndTrustName(String customerCode, 
                                                                        String trustName) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerCodeAndTrustName(customerCode, 
                                                                                                         trustName);
    }

    public Optional<List<CustomerEntity>> findByCustomerCodeAndCustomerName(String customerCode, 
                                                                          String customerName) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerCodeAndCustomerName(customerCode, 
                                                                                                           customerName);
    }

    public Optional<List<CustomerEntity>> findByCustomerCode(String customerCode) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerCode(customerCode);
    }

    public Optional<List<CustomerEntity>> findByCustomerName(String customerName) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByCustomerName(customerName);
    }

    public Optional<List<CustomerEntity>> findByTrustName(String trustName) {
        return searchMemberCustomerDetailsCustomerMakerControllerRepository.findByTrustName(trustName);
    }

}