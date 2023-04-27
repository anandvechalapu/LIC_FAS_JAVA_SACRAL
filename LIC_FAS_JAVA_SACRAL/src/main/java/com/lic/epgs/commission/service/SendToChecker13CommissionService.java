package com.lic.epgs.commission.service;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.commission.entity.Commission;

@Repository
public interface SendToChecker13CommissionRepository extends JpaRepository<Commission, Long> {
    
    @Transactional
    @Modifying
    @Query("UPDATE Commission c SET c.status = :status, c.workflowStatus = :workflowStatus, c.modifiedBy = :modifiedBy, c.modifiedOn = :modifiedOn WHERE c.id = :id")
    int sendToChecker(@Param("status") String status, @Param("workflowStatus") String workflowStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") LocalDateTime modifiedOn, @Param("id") Long id);
    
}

@Service
public class SendToChecker13CommissionService {
    
    private final SendToChecker13CommissionRepository sendToChecker13CommissionRepository;

    public SendToChecker13CommissionService(SendToChecker13CommissionRepository sendToChecker13CommissionRepository) {
        this.sendToChecker13CommissionRepository = sendToChecker13CommissionRepository;
    }

    public int sendToChecker(String status, String workflowStatus, String modifiedBy, LocalDateTime modifiedOn, Long id) {
        return sendToChecker13CommissionRepository.sendToChecker(status, workflowStatus, modifiedBy, modifiedOn, id);
    }

}