package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.dto.CommissionDto;
import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.repository.CommissionManagementRepository;

@Service
public class CommissionManagementService {
	
	@Autowired
	private CommissionManagementRepository commissionManagementRepository;
	
	public CommissionTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		return commissionManagementRepository.findByCommissionIdAndIsActive(commissionId, isActive);
	}
	
	public CommissionEntity saveCommission(CommissionEntity commissionEntity) {
		return commissionManagementRepository.save(commissionEntity);
	}
	
	public CommissionDto findByCommissionId(Long commissionId) {
		return commissionManagementRepository.findByCommissionId(commissionId);
	}
	
	public CommissionQuestionDetailsEntity saveCommissionQuestionDetails(CommissionQuestionDetailsEntity commissionQuestionDetailsEntity) {
		return commissionManagementRepository.save(commissionQuestionDetailsEntity);
	}
	
	public List<CommissionQuestionDetailsEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		return commissionManagementRepository.findByCommissionIdAndIsActive(commissionId, isActive);
	}
	
	public CommissionNotesEntity saveCommissionNotes(CommissionNotesEntity commissionNotesEntity) {
		return commissionManagementRepository.save(commissionNotesEntity);
	}
	
	public List<CommissionNotesEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive) {
		return commissionManagementRepository.findByCommissionIdAndIsActive(commissionId, isActive);
	}
}