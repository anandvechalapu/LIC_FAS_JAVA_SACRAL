package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.Subcustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository;

@Service
@Transactional
public class RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service {
    
    private final RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository;
    
    @Autowired
    public RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service(RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository) {
        this.removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository = removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository;
    }
    
    public Subcustomer findActiveSubcustomerById(Long subcustomerId) {
        return removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository.findActiveSubcustomerById(subcustomerId);
    }
    
    public int deactivateBankAccount(Long subcustomerId, Long bankAccountId) {
        return removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository.deactivateBankAccount(subcustomerId, bankAccountId);
    }

}