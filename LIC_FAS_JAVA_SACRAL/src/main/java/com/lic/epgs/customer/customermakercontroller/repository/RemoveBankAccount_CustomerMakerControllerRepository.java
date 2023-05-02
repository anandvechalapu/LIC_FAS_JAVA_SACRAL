import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoveBankAccount_CustomerMakerControllerRepository extends JpaRepository<RemoveBankAccount_CustomerMakerController, Long> {

    RemoveBankAccount_CustomerMakerController findByCustomerIdAndBankAccountId(Long customerId, Long bankAccountId);

    void deleteByCustomerIdAndBankAccountId(Long customerId, Long bankAccountId);

}