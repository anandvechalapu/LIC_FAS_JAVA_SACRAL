package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.stampduty.entity.StampDutyTempEntity;

public interface SaveStampDutyBasicDetailsRepository extends JpaRepository<StampDutyTempEntity, Long> {

	@Query("SELECT s FROM StampDutyTempEntity s WHERE s.stampId = :stampId")
	StampDutyTempEntity findByStampId(@Param("stampId") Long stampId);

	@Query("SELECT s FROM StampDutyTempEntity s WHERE s.policyStampTypeId = :policyStampTypeId")
	StampDutyTempEntity findByPolicyStampTypeId(@Param("policyStampTypeId") Long policyStampTypeId);

	@Query("SELECT s FROM StampDutyTempEntity s WHERE s.mstStampId = :mstStampId")
	StampDutyTempEntity findByMstStampId(@Param("mstStampId") Long mstStampId);

	@Query("SELECT s FROM StampDutyTempEntity s WHERE s.challanGrnNo = :challanGrnNo")
	StampDutyTempEntity findByChallanGrnNo(@Param("challanGrnNo") String challanGrnNo);

	@Query("SELECT s FROM StampDutyTempEntity s WHERE s.certificateQueryIdNo = :certificateQueryIdNo")
	StampDutyTempEntity findByCertificateQueryIdNo(@Param("certificateQueryIdNo") String certificateQueryIdNo);

}