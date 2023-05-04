package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.entity.SubCustomerCheckerController;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.SubCustomerCheckerControllerRepository;

@Service
public class SubCustomerCheckerControllerService {

    @Autowired
    private SubCustomerCheckerControllerRepository subCustomerCheckerControllerRepository;

    public SubCustomerCheckerController getExitingSubCustomerDetails(String subCustomerId) {
        return subCustomerCheckerControllerRepository.getExitingSubCustomerDetails(subCustomerId);
    }

}