package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface SaveQuestion9CommissionsRepository extends JpaRepository<CommissionQuestionDetailsTempEntity, Long> {
    
    @Transactional
    @Modifying
    @Query("UPDATE CommissionQuestionDetailsTempEntity c SET c.inactive = true WHERE c.id = :id")
    void markCommissionQuestionDetailsTempEntityAsInactiveById(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO commission_question_details_temp_entity (inactive, commission_id, details) VALUES (false, :commissionId, :details)", nativeQuery = true)
    void saveCommissionQuestionDetailsTempEntity(@Param("commissionId") Long commissionId, @Param("details") String details);

    @Transactional
    @Query(value = "SELECT c FROM CommissionQuestionDetailsTempEntity c WHERE c.commissionId = :commissionId")
    List<CommissionQuestionDetailsTempEntity> findByCommissionId(@Param("commissionId") Long commissionId);

    @Transactional
    @Query(value = "SELECT new com.lic.epgs.commission.dto.CommonCommissionDto(:transactionStatus, :transactionMessage, :commissionId, :commissionQuestionDetailsTempEntities)")
    CommonCommissionDto saveCommissionDetails(@Param("transactionStatus") String transactionStatus, @Param("transactionMessage") String transactionMessage, @Param("commissionId") Long commissionId, @Param("commissionQuestionDetailsTempEntities") List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntities);

}