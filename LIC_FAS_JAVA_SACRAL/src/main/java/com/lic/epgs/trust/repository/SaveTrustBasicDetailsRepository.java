package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustBasicDetails;

@Repository
public interface SaveTrustBasicDetailsRepository extends JpaRepository<TrustBasicDetails, Long> {

    TrustBasicDetails findByTrustCode(String trustCode);

    void save(TrustBasicDetails trustBasicDetails);

    void setTrustStatusAndWorkflowStatusAsDraft(String trustCode, boolean isDraft);

    void setIsActiveFlagAsTrue(String trustCode, boolean isActive);

    void handleExceptionsAndErrorsGracefully(String trustCode);

}