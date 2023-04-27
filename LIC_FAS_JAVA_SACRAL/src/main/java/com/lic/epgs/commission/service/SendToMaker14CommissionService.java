package com.lic.epgs.commission.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.Commission;
import com.lic.epgs.commission.repository.SendToMaker14CommissionRepository;

@Service
@Transactional
public class SendToMaker14CommissionService {

	@Autowired
	private SendToMaker14CommissionRepository sendToMaker14CommissionRepository;
	
	public void sendToMakerForModification(Long commissionId, String status, String workflowStatus, String modifiedBy, Date modifiedOn, Boolean isActive) {
		sendToMaker14CommissionRepository.sendToMakerForModification(commissionId, status, workflowStatus, modifiedBy, modifiedOn, isActive);
	}
	
	public Commission findCommissionById(Long commissionId, Boolean isActive) {
		return sendToMaker14CommissionRepository.findCommissionById(commissionId, isActive);
	}
	
	public void updateCommissionStatus(Long commissionId, String status, String modifiedBy, Date modifiedOn, Boolean isActive) {
		sendToMaker14CommissionRepository.updateCommissionStatus(commissionId, status, modifiedBy, modifiedOn, isActive);
	}
	
	public void updateCommissionWorkflowStatus(Long commissionId, String workflowStatus, String modifiedBy, Date modifiedOn, Boolean isActive) {
		sendToMaker14CommissionRepository.updateCommissionWorkflowStatus(commissionId, workflowStatus, modifiedBy, modifiedOn, isActive);
	}
}