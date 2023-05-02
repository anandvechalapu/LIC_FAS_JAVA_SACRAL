import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.customer.customermakercontroller.entity.CustomerAddressDetails;

public interface AddCustomerAddressDetails_CustomerMakerControllerRepository extends JpaRepository<CustomerAddressDetails, Long> {

    CustomerAddressDetails findByCustomerId(Long customerId);

    CustomerAddressDetails save(CustomerAddressDetails customerAddressDetails);

    void deleteByCustomerId(Long customerId);

}