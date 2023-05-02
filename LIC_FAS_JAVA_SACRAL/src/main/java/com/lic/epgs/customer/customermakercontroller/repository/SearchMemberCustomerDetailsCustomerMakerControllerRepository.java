@Repository
public interface SearchMemberCustomerDetailsCustomerMakerControllerRepository extends JpaRepository<CustomerEntity, Long> {

    Optional<List<CustomerEntity>> findByCustomerCodeAndCustomerNameAndTrustName(String customerCode, String customerName, String trustName);
    
    Optional<List<CustomerEntity>> findByCustomerNameAndTrustName(String customerName, String trustName);
    
    Optional<List<CustomerEntity>> findByCustomerCodeAndTrustName(String customerCode, String trustName);
    
    Optional<List<CustomerEntity>> findByCustomerCodeAndCustomerName(String customerCode, String customerName);
    
    Optional<List<CustomerEntity>> findByCustomerCode(String customerCode);
    
    Optional<List<CustomerEntity>> findByCustomerName(String customerName);
    
    Optional<List<CustomerEntity>> findByTrustName(String trustName);
}