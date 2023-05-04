package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.Subcustomer;

@Repository
public interface RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository extends JpaRepository<Subcustomer, Long> {
    
    @Query("SELECT s FROM Subcustomer s WHERE s.subcustomerId = :subcustomerId AND s.active = true")
    Subcustomer findActiveSubcustomerById(@Param("subcustomerId") Long subcustomerId);
    
    @Modifying
    @Query("UPDATE Subcustomer s SET s.bankAccountId = null, s.active = false WHERE s.subcustomerId = :subcustomerId AND s.bankAccountId = :bankAccountId")
    int deactivateBankAccount(@Param("subcustomerId") Long subcustomerId, @Param("bankAccountId") Long bankAccountId);
    
}

package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.Subcustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service;

@RestController
@RequestMapping("/subcustomers")
public class RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Controller {
    
    private final RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service;
    
    @Autowired
    public RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Controller(RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service) {
        this.removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service = removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service;
    }
    
    @DeleteMapping("/{subcustomerId}/bankaccounts/{bankAccountId}")
    public Subcustomer deactivateBankAccount(@PathVariable Long subcustomerId, @PathVariable Long bankAccountId) {
        Subcustomer subcustomer = removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service.findActiveSubcustomerById(subcustomerId);
        if (subcustomer != null) {
            int numberOfRowsUpdated = removeBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Service.deactivateBankAccount(subcustomerId, bankAccountId);
            if (numberOfRowsUpdated > 0) {
                return subcustomer;
            }
        }
        return null;
    }
}