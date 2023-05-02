package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.entity.GroupCustomerBasicDetailsTempEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GroupCustomerDetailsRepository extends JpaRepository<GroupCustomerBasicDetailsTempEntity, Long> {

    @Transactional
    GroupCustomerBasicDetailsTempEntity findByGroupCustomerId(String groupCustomerId);

    @Transactional
    GroupCustomerBasicDetailsTempEntity save(GroupCustomerBasicDetailsDto groupCustomerBasicDetailsDto);

    @Transactional
    CommonResponseDto updateGroupStatusAndWorkflowStatus(Long groupCustomerId, String groupStatus, String workflowStatus);

}