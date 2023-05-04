@Repository
public interface SaveTrustBankAccountDetailsRepository extends JpaRepository<BankAccountDetailsTempEntity, Long> {
	
	Optional<BankAccountDetailsTempEntity> findByAccountNumberAndIsActiveTrue(String accountNumber);
	
	@Modifying
	@Query("UPDATE BankAccountDetailsTempEntity b SET b.isActive = false WHERE b.accountNumber = :accountNumber")
	void updateIsActiveToFalse(@Param("accountNumber") String accountNumber);
	
	@Transactional
	@Override
	BankAccountDetailsTempEntity save(BankAccountDetailsTempEntity bankAccountDetailsTempEntity);
}