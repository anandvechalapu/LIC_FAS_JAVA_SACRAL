package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.Subcustomer;

public interface RemoveBankAccount_SUB_CUSTOMER_MAKER_CONTROLLER_9Repository extends JpaRepository<Subcustomer, Long> {
    
    @Query("SELECT s FROM Subcustomer s WHERE s.subcustomerId = ?1 and s.active = true")
    Subcustomer findActiveSubcustomerById(Long subcustomerId);
    
    @Modifying
    @Query("UPDATE Subcustomer s SET s.active = false WHERE s.subcustomerId = ?1 and s.bankAccountId = ?2 and s.active = true")
    int deactivateBankAccount(Long subcustomerId, Long bankAccountId);

}