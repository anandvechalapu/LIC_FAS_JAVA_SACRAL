package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.model.GstExcemption;

@Repository
public interface GstExcemptionRepository extends JpaRepository<GstExcemption, Long> {
	List<GstExcemption> findByLoginUserAndUnitCode(String loginUser, String unitCode);
	List<GstExcemption> findByGstExcemptionStatusAndUnitCode(String gstExcemptionStatus, String unitCode);
	List<GstExcemption> findByUnitCode(String unitCode);
}