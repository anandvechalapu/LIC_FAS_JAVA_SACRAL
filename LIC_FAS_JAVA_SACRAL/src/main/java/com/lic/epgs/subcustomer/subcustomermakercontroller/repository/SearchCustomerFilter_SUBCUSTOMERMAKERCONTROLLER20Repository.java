import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;

public interface SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Repository extends JpaRepository<Customer, Long> {

	@Query("SELECT c FROM Customer c WHERE c.customerCode = :customerCode AND c.customerName = :customerName AND c.customerType = :customerType AND c.pan = :pan AND c.createdOn BETWEEN :fromDate AND :toDate AND c.status = :status")
	List<Customer> searchCustomerByCriteria(@Param("customerCode") String customerCode, 
			@Param("customerName") String customerName, 
			@Param("customerType") String customerType, 
			@Param("pan") String pan, 
			@Param("fromDate") String fromDate, 
			@Param("toDate") String toDate,
			@Param("status") String status);

}