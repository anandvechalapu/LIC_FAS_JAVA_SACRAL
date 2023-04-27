package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionMasterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;

@Repository
public interface CommissionQuestionMasterRepository extends JpaRepository<CommissionQuestionMasterDto, Long> {

    CommonCommissionDto saveQuestionMaster2(CommissionQuestionMasterDto commissionQuestionMasterDto) throws ConstraintViolationException, PersistenceException;

}