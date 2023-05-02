package com.lic.epgs.group.groupcustomercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.model.GroupCustomerBasicDetailsTempEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.service.RejectGroupService;

@RestController
@RequestMapping("/groupCustomer")
public class GroupCustomerCheckerController {
	
	@Autowired
	RejectGroupService rejectGroupService;
	
	@PostMapping("/rejectGroupCustomerTemp")
	public void rejectGroupCustomerTemp(@RequestBody Long groupCustomerId) {
		rejectGroupService.rejectGroupCustomerTemp(groupCustomerId);
	}
	
	@PostMapping("/updateRejectionRemarks")
	public void updateRejectionRemarks(@RequestBody GroupCustomerBasicDetailsTempEntity groupCustomerBasicDetailsTempEntity) {
		rejectGroupService.updateRejectionRemarks(groupCustomerBasicDetailsTempEntity.getGroupCustomerId(), groupCustomerBasicDetailsTempEntity.getRejectionRemarks(), groupCustomerBasicDetailsTempEntity.getModifiedBy());
	}
	
	@PostMapping("/updateGroupStatusForDefunct")
	public void updateGroupStatusForDefunct(@RequestBody GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity) {
		rejectGroupService.updateGroupStatusForDefunct(groupCustomerBasicDetailsEntity.getGroupCode(), groupCustomerBasicDetailsEntity.getGroupStatus(), groupCustomerBasicDetailsEntity.getWorkflowStatus());
	}
	
	@PostMapping("/updateGroupStatusForReopen")
	public void updateGroupStatusForReopen(@RequestBody GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity) {
		rejectGroupService.updateGroupStatusForReopen(groupCustomerBasicDetailsEntity.getGroupCode(), groupCustomerBasicDetailsEntity.getGroupStatus(), groupCustomerBasicDetailsEntity.getWorkflowStatus());
	}
	
	@PostMapping("/insertGroupCustomerBasicDetails")
	public void insertGroupCustomerBasicDetails(@RequestBody GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity) {
		rejectGroupService.insertGroupCustomerBasicDetails(groupCustomerBasicDetailsEntity.getGroupCode(), groupCustomerBasicDetailsEntity.getGroupStatus(), groupCustomerBasicDetailsEntity.getWorkflowStatus(), groupCustomerBasicDetailsEntity.getTempGroupCustomerId());
	}
	
	@PostMapping("/findByGroupCustomerId")
	public Optional<GroupCustomerBasicDetailsTempEntity> findByGroupCustomerId(@RequestBody Long groupCustomerId) {
		return rejectGroupService.findByGroupCustomerId(groupCustomerId);
	}
	
	@PostMapping("/findByGroupCode")
	public Optional<GroupCustomerBasicDetailsEntity> findByGroupCode(@RequestBody String groupCode) {
		return rejectGroupService.findByGroupCode(groupCode);
	}
}