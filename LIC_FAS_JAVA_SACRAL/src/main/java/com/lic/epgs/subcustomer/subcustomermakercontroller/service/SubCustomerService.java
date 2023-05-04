package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerRepository;

@Service
public class SubCustomerService {

    @Autowired
    private SubCustomerRepository subCustomerRepository;

    public SubCustomer findByName(String name) {
        return subCustomerRepository.findByName(name);
    }

    public SubCustomer findByCode(String code) {
        return subCustomerRepository.findByCode(code);
    }

    public SubCustomer save(SubCustomer subCustomer) {
        return subCustomerRepository.save(subCustomer);
    }

    public void deleteByName(String name) {
        subCustomerRepository.deleteByName(name);
    }

    public void deleteByCode(String code) {
        subCustomerRepository.deleteByCode(code);
    }

    public void updateSubCustomerMappedDetails(String name, String code) {
        subCustomerRepository.updateSubCustomerMappedDetails(name, code);
    }

    public void generateSubCustomerCode(String name) {
        subCustomerRepository.generateSubCustomerCode(name);
    }

    public void validateSubCustomerName(String name) {
        subCustomerRepository.validateSubCustomerName(name);
    }

}