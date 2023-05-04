package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.MasterSubcustomerDetails;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.GetMasterSubcustomerDetails_SubCustomerMakerControllerRepository;

@Service
public class GetMasterSubcustomerDetails_SubCustomerMakerControllerService {

    @Autowired
    GetMasterSubcustomerDetails_SubCustomerMakerControllerRepository getMasterSubcustomerDetails_SubCustomerMakerControllerRepository;

    // Retrieve master subcustomer details
    public List<MasterSubcustomerDetails> getBySubcustomerName(String subcustomerName) {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerRepository.findBySubcustomerName(subcustomerName);
    }

    // Retrieve master subcustomer details when the subcustomer status is approved
    public Optional<MasterSubcustomerDetails> getBySubcustomerStatus() {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerRepository.findBySubcustomerStatus();
    }

    // Retrieve master subcustomer details when the ‘isActive’ is set to true
    public Optional<MasterSubcustomerDetails> getByIsActive() {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerRepository.findByIsActive();
    }
}