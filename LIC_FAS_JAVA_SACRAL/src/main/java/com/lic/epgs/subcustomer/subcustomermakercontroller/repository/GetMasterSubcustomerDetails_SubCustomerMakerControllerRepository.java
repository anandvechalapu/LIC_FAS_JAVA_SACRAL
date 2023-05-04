package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.MasterSubcustomerDetails;

@Repository
public interface GetMasterSubcustomerDetails_SubCustomerMakerControllerRepository extends JpaRepository<MasterSubcustomerDetails, Long> {

    // Retrieve master subcustomer details
    @Query("SELECT m FROM MasterSubcustomerDetails m WHERE m.subcustomerName = ?1")
    MasterSubcustomerDetails findBySubcustomerName(String subcustomerName);

    // Retrieve master subcustomer details when the subcustomer status is approved
    @Query("SELECT m FROM MasterSubcustomerDetails m WHERE m.subcustomerStatus = 'Approved'")
    MasterSubcustomerDetails findBySubcustomerStatus();
    
    // Retrieve master subcustomer details when the ‘isActive’ is set to true
    @Query("SELECT m FROM MasterSubcustomerDetails m WHERE m.isActive = true")
    MasterSubcustomerDetails findByIsActive();

}