import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.trust.dto.BankAccountDetailsDto;

public interface ListTrustBankAccountDetailsRepository extends JpaRepository<BankAccountDetailsDto, Integer>{
    
    List<BankAccountDetailsDto> findByTrustId(int trustId);
}