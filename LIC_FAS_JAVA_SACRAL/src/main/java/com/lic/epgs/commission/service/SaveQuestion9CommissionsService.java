package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.repository.SaveQuestion9CommissionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaveQuestion9CommissionsService {

    @Autowired
    private SaveQuestion9CommissionsRepository saveQuestion9CommissionsRepository;

    @Transactional
    public void markCommissionQuestionDetailsTempEntityAsInactiveById(Long id) {
        saveQuestion9CommissionsRepository.markCommissionQuestionDetailsTempEntityAsInactiveById(id);
    }

    @Transactional
    public void saveCommissionQuestionDetailsTempEntity(Long commissionId, String details) {
        saveQuestion9CommissionsRepository.saveCommissionQuestionDetailsTempEntity(commissionId, details);
    }

    @Transactional
    public List<CommissionQuestionDetailsTempEntity> findByCommissionId(Long commissionId) {
        return saveQuestion9CommissionsRepository.findByCommissionId(commissionId);
    }

    @Transactional
    public CommonCommissionDto saveCommissionDetails(String transactionStatus, String transactionMessage, Long commissionId, List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntities) {
        return saveQuestion9CommissionsRepository.saveCommissionDetails(transactionStatus, transactionMessage, commissionId, commissionQuestionDetailsTempEntities);
    }
}