package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.entity.GroupCustomerBasicDetailsTempEntity;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GroupCustomerDetailsService {

    @Autowired
    private GroupCustomerDetailsRepository groupCustomerDetailsRepository;

    @Transactional
    public GroupCustomerBasicDetailsTempEntity findByGroupCustomerId(String groupCustomerId) {
        return groupCustomerDetailsRepository.findByGroupCustomerId(groupCustomerId);
    }

    @Transactional
    public GroupCustomerBasicDetailsTempEntity save(GroupCustomerBasicDetailsDto groupCustomerBasicDetailsDto) {
        return groupCustomerDetailsRepository.save(groupCustomerBasicDetailsDto);
    }

    @Transactional
    public CommonResponseDto updateGroupStatusAndWorkflowStatus(Long groupCustomerId, String groupStatus, String workflowStatus) {
        return groupCustomerDetailsRepository.updateGroupStatusAndWorkflowStatus(groupCustomerId, groupStatus, workflowStatus);
    }

}