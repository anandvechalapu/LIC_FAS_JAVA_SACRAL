package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustDetailsTempEntity;

@Repository
public interface TrustDetailsTempRepository extends JpaRepository<TrustDetailsTempEntity, Long> {
	
	TrustDetailsTempEntity findByTrustId(Long trustId);
	
	void save(TrustDetailsTempEntity trustDetailsTempEntity);
	
	void deleteByTrustId(Long trustId);
	
	void updateTrustStatusByTrustId(String trustStatus, Long trustId);
	
	void updateWorkflowStatusByTrustId(String workflowStatus, Long trustId);
	
	void updateIsActiveByTrustId(Boolean isActive, Long trustId);
	
	void updateModifiedByAndModifiedOnByTrustId(String modifiedBy, Long trustId);
	
	TrustDetailsTempEntity findByTempBankAccountId(Long tempBankAccountId);
	
	TrustDetailsTempEntity findByTempContactPersonId(Long tempContactPersonId);
	
	void updateIsActiveByBankAccountId(Boolean isActive, Long bankAccountId);
	
	void updateTrustIdByBankAccountId(Long newTrustId, Long bankAccountId);
	
	void updateIsActiveByContactPersonId(Boolean isActive, Long contactPersonId);
	
	void updateTrustIdByContactPersonId(Long newTrustId, Long contactPersonId);
	
}