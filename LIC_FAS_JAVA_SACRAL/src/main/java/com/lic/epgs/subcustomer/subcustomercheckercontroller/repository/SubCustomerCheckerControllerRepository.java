package com.lic.epgs.subcustomer.subcustomercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer;

@Repository
public interface SubCustomerCheckerControllerRepository extends JpaRepository<SubCustomer, Long> {

    @Modifying
    @Query("UPDATE SubCustomer SET address = ?1, contact = ?2, notes = ?3, bankAccountDetails = ?4 WHERE customerId = ?5")
    void updateSubCustomer(String address, String contact, String notes, String bankAccountDetails, Long customerId);

    @Query("SELECT s FROM SubCustomer s WHERE s.customerId = ?1")
    SubCustomer findSubCustomerByCustomerId(Long customerId);

}