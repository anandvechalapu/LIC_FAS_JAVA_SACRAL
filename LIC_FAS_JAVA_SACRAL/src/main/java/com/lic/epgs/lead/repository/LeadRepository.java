package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.model.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
	
	@Query(value = "SELECT l FROM Lead l WHERE lower(l.leadName) = lower(:leadName) AND l.status IN ('APPROVED', 'REJECTED', 'CLOSED')")
	public Lead existingSearchByLeadName_LEAD(@Param("leadName") String leadName);

}