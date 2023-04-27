package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.gstexcemption.model.GstExcemption;

@Repository
public interface SendToApprove5_GstExcemptionRepository extends JpaRepository<GstExcemption, Integer> {

	GstExcemption findByGstExcemptionId(String gstExcemptionId);
	
	void save(GstExcemption gstExcemption);
	
	void update(GstExcemption gstExcemption);
	
	void createNewGstNotesAndDocDetails(GstExcemption gstExcemption);
	
	String getNewGstExcemptionId();
}