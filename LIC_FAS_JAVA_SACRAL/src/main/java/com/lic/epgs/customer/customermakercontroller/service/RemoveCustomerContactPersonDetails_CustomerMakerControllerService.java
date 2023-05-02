package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerContactPerson;
import com.lic.epgs.customer.customermakercontroller.repository.RemoveCustomerContactPersonDetails_CustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveCustomerContactPersonDetails_CustomerMakerControllerService {

    @Autowired
    private RemoveCustomerContactPersonDetails_CustomerMakerControllerRepository removeCustomerContactPersonDetails_customerMakerControllerRepository;

    public CustomerContactPerson findByCustomerIdAndContactPersonId(Long customerId, Long contactPersonId){
        return removeCustomerContactPersonDetails_customerMakerControllerRepository.findByCustomerIdAndContactPersonId(customerId, contactPersonId);
    }

    public void deleteByCustomerIdAndContactPersonId(Long customerId, Long contactPersonId){
        removeCustomerContactPersonDetails_customerMakerControllerRepository.deleteByCustomerIdAndContactPersonId(customerId, contactPersonId);
    }

}