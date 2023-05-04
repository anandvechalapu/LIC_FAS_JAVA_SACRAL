package com.lic.epgs.trust.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustDetailsTempEntity;
import com.lic.epgs.trust.model.BankAccountDetailsTempEntity;
import com.lic.epgs.trust.model.BankAccountDetailsEntity;
import com.lic.epgs.trust.model.ContactDetailsTempEntity;
import com.lic.epgs.trust.model.ContactDetailEntity;

@Repository
public interface TrustManagementRepository extends JpaRepository<TrustDetailsTempEntity, Long> {
 
	public TrustDetailsTempEntity findByTrustId(Long trustId);
	
	public BankAccountDetailsTempEntity findByTrustIdAndIsActiveIsTrue(Long trustId);
	
	public ContactDetailsTempEntity findByTrustIdAndIsActiveIsTrue(Long trustId);
	
	public BankAccountDetailsEntity save(BankAccountDetailsEntity bankAccountDetails);
	
	public ContactDetailEntity save(ContactDetailEntity contactDetail);
	
	public void deleteByTrustId(Long trustId);
	
	public void deleteByBankAccountId(Long bankAccountId);
	
	public void deleteByContactPersonId(Long contactPersonId);
	
}