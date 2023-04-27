package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionMasterDto;
import com.lic.epgs.commission.repository.CommissionQuestionMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;

@Service
public class CommissionQuestionMasterService {

    @Autowired
    CommissionQuestionMasterRepository commissionQuestionMasterRepository;

    public CommonCommissionDto saveQuestionMaster2(CommissionQuestionMasterDto commissionQuestionMasterDto) throws ConstraintViolationException, PersistenceException {
        return commissionQuestionMasterRepository.saveQuestionMaster2(commissionQuestionMasterDto);
    }

}