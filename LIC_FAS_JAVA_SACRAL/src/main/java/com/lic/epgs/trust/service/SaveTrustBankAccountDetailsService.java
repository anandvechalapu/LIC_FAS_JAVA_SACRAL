package com.lic.epgs.trust.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.trust.entity.BankAccountDetailsTempEntity;

public interface SaveTrustBankAccountDetailsRepository extends JpaRepository<BankAccountDetailsTempEntity, Long> {
	
	Optional<BankAccountDetailsTempEntity> findByAccountNumberAndIsActiveTrue(String accountNumber);
	
	@Modifying
	@Query("UPDATE BankAccountDetailsTempEntity b SET b.isActive = false WHERE b.accountNumber = :accountNumber")
	void updateIsActiveToFalse(@Param("accountNumber") String accountNumber);
	
	@Transactional
	@Override
	BankAccountDetailsTempEntity save(BankAccountDetailsTempEntity bankAccountDetailsTempEntity);
}

@Service
public class SaveTrustBankAccountDetailsService {

	private final SaveTrustBankAccountDetailsRepository saveTrustBankAccountDetailsRepository;
	
	public SaveTrustBankAccountDetailsService(SaveTrustBankAccountDetailsRepository saveTrustBankAccountDetailsRepository) {
		this.saveTrustBankAccountDetailsRepository = saveTrustBankAccountDetailsRepository;
	}
	
	public Optional<BankAccountDetailsTempEntity> findByAccountNumberAndIsActiveTrue(String accountNumber) {
		return saveTrustBankAccountDetailsRepository.findByAccountNumberAndIsActiveTrue(accountNumber);
	}
	
	public void updateIsActiveToFalse(String accountNumber) {
		saveTrustBankAccountDetailsRepository.updateIsActiveToFalse(accountNumber);
	}
	
	public BankAccountDetailsTempEntity save(BankAccountDetailsTempEntity bankAccountDetailsTempEntity) {
		return saveTrustBankAccountDetailsRepository.save(bankAccountDetailsTempEntity);
	}
	
}