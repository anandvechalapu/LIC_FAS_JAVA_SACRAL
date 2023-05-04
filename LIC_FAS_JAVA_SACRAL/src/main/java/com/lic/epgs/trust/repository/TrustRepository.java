package com.lic.epgs.trust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.Trust;

@Repository
public interface TrustRepository extends JpaRepository<Trust, Long> {

	@Query("SELECT t FROM Trust t WHERE t.trustId = ?1 AND t.unitCode = ?2")
	List<Trust> getExistingTrustDetails(String trustId, String unitCode);

}