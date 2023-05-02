package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.model.CustomerContactDetails;

@Repository
public interface AddCustomerContactDetails_CustomerMakerControllerRepository extends JpaRepository<CustomerContactDetails, Long> {
 
    CustomerContactDetails findByCustomerId(Long customerId);
 
    CustomerContactDetails save(CustomerContactDetails customerContactDetails);
 
    void deleteByCustomerId(Long customerId);
}