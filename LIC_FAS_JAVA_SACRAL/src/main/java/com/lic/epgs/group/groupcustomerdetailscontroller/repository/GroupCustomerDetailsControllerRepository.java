import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerAddressDetails, Long> {
    
    List<GroupCustomerAddressDetails> findByGroupAddressIdAndGroupCustomerId(Long groupAddressId, Long groupCustomerId);
    
    List<GroupCustomerAddressDetails> findByGroupCustomerId(Long groupCustomerId);
    
    Optional<GroupCustomerAddressDetails> findByGroupCustomerIdAndAddressId(Long groupCustomerId, Long addressId);
}