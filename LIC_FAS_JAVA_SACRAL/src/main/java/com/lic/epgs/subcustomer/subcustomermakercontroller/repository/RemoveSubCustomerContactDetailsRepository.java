import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoveSubCustomerContactDetailsRepository extends JpaRepository<SubCustomerMakerController, Long> {
    
    void removeSubCustomerContactDetails(Long subCustomerId, Long contactPersonId);
    
    Boolean updateContactDetailsStatus(Long subCustomerId, Long contactPersonId);
    
    String getSuccessMessage(Long subCustomerId, Long contactPersonId);
    
    String getErrorMessage(Long subCustomerId, Long contactPersonId);

}