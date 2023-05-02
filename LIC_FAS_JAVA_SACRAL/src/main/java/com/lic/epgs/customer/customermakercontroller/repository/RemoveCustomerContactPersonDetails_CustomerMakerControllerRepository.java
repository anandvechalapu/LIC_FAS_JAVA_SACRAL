import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerContactPerson;

public interface RemoveCustomerContactPersonDetails_CustomerMakerControllerRepository extends JpaRepository<CustomerContactPerson, Long> {

    CustomerContactPerson findByCustomerIdAndContactPersonId(Long customerId, Long contactPersonId);

    void deleteByCustomerIdAndContactPersonId(Long customerId, Long contactPersonId);

}