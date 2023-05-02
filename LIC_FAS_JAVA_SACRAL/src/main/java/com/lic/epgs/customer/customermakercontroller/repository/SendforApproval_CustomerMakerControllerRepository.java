import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsTemp;

@Repository
public interface SendforApproval_CustomerMakerControllerRepository extends JpaRepository<CustomerBasicDetailsDto, Long> {

    CustomerBasicDetailsTemp saveForApproval(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    CustomerBasicDetailsDto findByCustomerId(Long customerId);
    
    CustomerBasicDetailsTemp findByCustomerIdAndIsActive(Long customerId, boolean isActive);
}