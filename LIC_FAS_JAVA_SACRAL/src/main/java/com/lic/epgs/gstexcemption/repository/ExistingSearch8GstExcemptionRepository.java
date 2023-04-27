package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.model.ExistingSearch8GstExcemption;

@Repository
public interface ExistingSearch8GstExcemptionRepository extends JpaRepository<ExistingSearch8GstExcemption, Long> {

	public ExistingSearch8GstExcemption findByUnitCode(String unitCode);
	
}