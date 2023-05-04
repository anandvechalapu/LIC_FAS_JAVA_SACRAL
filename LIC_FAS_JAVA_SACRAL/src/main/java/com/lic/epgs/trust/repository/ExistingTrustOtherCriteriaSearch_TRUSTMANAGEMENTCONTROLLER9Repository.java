package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository extends JpaRepository<ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9, Long>{
    
    @Query("SELECT t FROM ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9 t WHERE t.criteria IN :criteria")
    ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9 findByCriteria(String criteria);
}