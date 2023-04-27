package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.stampduty.model.RejectStampDuty;

public interface RejectStampDutyRepository extends JpaRepository<RejectStampDuty, Long> {

    RejectStampDuty findByRejectionReasonCode(String rejectionReasonCode);
 
    RejectStampDuty findByRejectionRemarks(String rejectionRemarks);
    
    RejectStampDuty save(RejectStampDuty rejectStampDuty);
    
    void delete(RejectStampDuty rejectStampDuty);

}