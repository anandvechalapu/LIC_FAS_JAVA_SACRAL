package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.CommonBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.SubCustomerBasicDetailsTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER extends JpaRepository<SubCustomerBasicDetailsTempEntity, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE SubCustomerBasicDetailsTempEntity SET status = :status, workflow_status = :workflowStatus WHERE id = :id AND active = true")
    void updateSubCustomer(int id, String status, String workflowStatus);

    @Query("SELECT new com.lic.epgs.subcustomer.subcustomermakercontroller.dto.CommonBasicDetailsDtos(scbd.id, scbd.status, scbd.workflow_status) FROM SubCustomerBasicDetailsTempEntity scbd WHERE scbd.id = :id AND scbd.active = true")
    CommonBasicDetailsDtos getUpdatedSubCustomer(int id);
}