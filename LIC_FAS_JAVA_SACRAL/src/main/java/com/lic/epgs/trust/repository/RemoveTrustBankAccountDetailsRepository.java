@Repository
public interface RemoveTrustBankAccountDetailsRepository extends JpaRepository<TrustManagementController22, Long> {

	Optional<TrustManagementController22> findByTrustIdAndBankAccountIdAndRole(Long trustId, Long bankAccountId, String role);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM TrustManagementController22 WHERE trustId=:trustId AND bankAccountId=:bankAccountId AND role=:role")
 	Integer deleteByTrustIdAndBankAccountIdAndRole(@Param("trustId") Long trustId, @Param("bankAccountId") Long bankAccountId, @Param("role") String role);
}