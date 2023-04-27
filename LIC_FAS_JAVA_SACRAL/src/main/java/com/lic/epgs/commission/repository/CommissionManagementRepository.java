package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;

@Repository
public interface CommissionManagementRepository extends JpaRepository<CommissionTempEntity, Long> {
    
    public CommissionTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public CommissionEntity save(CommissionEntity commissionEntity);
    
    public CommissionDto findByCommissionId(Long commissionId);
    
    public CommissionQuestionDetailsTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public CommissionQuestionDetailsEntity save(CommissionQuestionDetailsEntity commissionQuestionDetailsEntity);
    
    public CommissionNotesTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);
    
    public CommissionNotesEntity save(CommissionNotesEntity commissionNotesEntity);
}