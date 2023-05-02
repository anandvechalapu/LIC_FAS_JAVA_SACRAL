package com.lic.epgs.group.groupcustomercheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsTempEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.repository.RejectGroupRepository;

@Service
public class RejectGroupService {

	@Autowired
	RejectGroupRepository rejectGroupRepository;

	public void rejectGroupCustomerTemp(Long groupCustomerId) {
		rejectGroupRepository.rejectGroupCustomerTemp(groupCustomerId);
	}
	
	public void updateRejectionRemarks(Long groupCustomerId, String rejectionRemarks, String modifiedBy) {
		rejectGroupRepository.updateRejectionRemarks(groupCustomerId, rejectionRemarks, modifiedBy);
	}
	
	public void updateGroupStatusForDefunct(String groupCode, String status, String workflowStatus) {
		rejectGroupRepository.updateGroupStatusForDefunct(groupCode, status, workflowStatus);
	}
	
	public void updateGroupStatusForReopen(String groupCode, String status, String workflowStatus) {
		rejectGroupRepository.updateGroupStatusForReopen(groupCode, status, workflowStatus);
	}
	
	public void insertGroupCustomerBasicDetails(String groupCode, String groupStatus, String workflowStatus, Long tempGroupCustomerId) {
		rejectGroupRepository.insertGroupCustomerBasicDetails(groupCode, groupStatus, workflowStatus, tempGroupCustomerId);
	}
	
	public Optional<GroupCustomerBasicDetailsTempEntity> findByGroupCustomerId(Long groupCustomerId) {
		return rejectGroupRepository.findById(groupCustomerId);
	}
	
	public Optional<GroupCustomerBasicDetailsEntity> findByGroupCode(String groupCode) {
		return rejectGroupRepository.findByGroupCode(groupCode);
	}

}