@Service
public class RemoveTrustBankAccountDetailsService {
	
	@Autowired
	private RemoveTrustBankAccountDetailsRepository removeTrustBankAccountDetailsRepository;
	
	public Optional<TrustManagementController22> findByTrustIdAndBankAccountIdAndRole(Long trustId, Long bankAccountId, String role) {
		return removeTrustBankAccountDetailsRepository.findByTrustIdAndBankAccountIdAndRole(trustId, bankAccountId, role);
	}
	
	public Integer deleteByTrustIdAndBankAccountIdAndRole(Long trustId, Long bankAccountId, String role) {
		return removeTrustBankAccountDetailsRepository.deleteByTrustIdAndBankAccountIdAndRole(trustId, bankAccountId, role);
	}

}