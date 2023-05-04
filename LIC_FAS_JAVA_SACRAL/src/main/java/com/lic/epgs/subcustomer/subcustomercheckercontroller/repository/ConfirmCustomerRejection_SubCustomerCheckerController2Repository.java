import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.Customer;

public interface ConfirmCustomerRejection_SubCustomerCheckerController2Repository extends JpaRepository<Customer, Long> {

    Customer findByCustomerId(Long customerId);

    void updateCustomerDetails(Customer customer);

    void markCustomerAsInactive(Long customerId);

    void sendResponseToUser();

}