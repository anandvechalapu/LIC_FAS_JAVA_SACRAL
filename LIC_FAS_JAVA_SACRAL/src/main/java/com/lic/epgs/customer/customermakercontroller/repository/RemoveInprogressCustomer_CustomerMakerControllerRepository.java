package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoveInprogressCustomer_CustomerMakerControllerRepository extends JpaRepository<Customer, Integer> {

    Logger logger = LoggerFactory.getLogger(RemoveInprogressCustomer_CustomerMakerControllerRepository.class);

    /**
     * Method used to remove a customer who is in the in-progress state from the system
     * 
     * @param customerId
     * @return CommonResponseDto
     */
    default CommonResponseDto removeInprogressCustomer(Integer customerId) {
        Customer customer = findById(customerId).orElse(null);
        if (customer != null && customer.getStatus().equals("in-progress")) {
            customer.setStatus("inactive");
            save(customer);
            logger.info("Removed in-progress customer with customerId: {}", customerId);
            return new CommonResponseDto("success", "Customer removed successfully");
        } else {
            logger.error("Customer with customerId: {} does not exist or is not in the in-progress state", customerId);
            return new CommonResponseDto("failure", "Customer does not exist or is not in the in-progress state");
        }
    }

}