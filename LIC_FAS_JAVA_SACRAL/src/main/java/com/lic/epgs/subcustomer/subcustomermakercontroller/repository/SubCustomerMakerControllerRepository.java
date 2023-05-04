package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;

public interface SubCustomerMakerControllerRepository extends JpaRepository<SubCustomerMakerController, Long> {
 
    @Query("SELECT s FROM SubCustomerMakerController s WHERE s.status = ?1 AND s.workflowStatus = ?2")
    SubCustomerMakerController findByStatusAndWorkflowStatus(String status, String workflowStatus);
    
    @Query("UPDATE SubCustomerMakerController s SET s.status = ?1 WHERE s.id = ?2")
    void updateStatusById(String status, Long id);
    
    @Query("UPDATE SubCustomerMakerController s SET s.mappedDetails = ?1 WHERE s.id = ?2")
    void updateMappedDetailsById(String mappedDetails, Long id);
    
}