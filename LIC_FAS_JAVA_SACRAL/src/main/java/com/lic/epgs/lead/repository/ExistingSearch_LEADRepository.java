package com.lic.epgs.lead.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.model.Lead;

@Repository
public interface ExistingSearch_LEADRepository extends JpaRepository<Lead, Long> {

	@Query("SELECT l FROM Lead l WHERE l.unitCode = ?1 AND l.createdBy = ?2")
	List<Lead> findLeadByUnitCodeAndCreatedBy(String unitCode, String createdBy);

	@Query("SELECT l FROM Lead l WHERE l.unitCode = ?1")
	List<Lead> findLeadByUnitCode(String unitCode);

}