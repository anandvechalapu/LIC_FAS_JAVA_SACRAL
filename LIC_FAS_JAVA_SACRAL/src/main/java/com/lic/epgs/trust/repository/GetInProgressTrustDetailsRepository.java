package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustDetails;

@Repository
public interface GetInProgressTrustDetailsRepository extends JpaRepository<TrustDetails, Long> {

	@Query("SELECT t FROM TrustDetails t WHERE t.trustId = :trustId AND t.unitCode = :unitCode")
	TrustDetails getTrustDetailsByTrustIdAndUnitCode(@Param("trustId") String trustId, @Param("unitCode") String unitCode);

}