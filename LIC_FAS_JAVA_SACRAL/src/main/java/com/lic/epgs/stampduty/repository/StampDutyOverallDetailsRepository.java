@Repository
package com.lic.epgs.stampduty.repository;

import com.lic.epgs.stampduty.dto.CommonResponseStampDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StampDutyOverallDetailsRepository extends JpaRepository<CommonResponseStampDto, Long> {

    @Query("SELECT s FROM CommonResponseStampDto s WHERE s.stampId = ?1")
    CommonResponseStampDto getStampDutyOverallDetails_STAMP_DUTY_7(Long stampId);

}