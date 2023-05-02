package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customercheckercontroller.model.Customer;

@Repository
public interface CustomerCheckerControllerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.customerId = ?1")
    Customer findByCustomerId(Long customerId);

    @Query("SELECT c FROM Customer c WHERE c.customerId = ?1 AND c.trustCode = ?2")
    Customer findByCustomerIdAndTrustCode(Long customerId, String trustCode);

    @Query("SELECT c FROM Customer c WHERE c.customerId = ?1 AND c.trustName = ?2")
    Customer findByCustomerIdAndTrustName(Long customerId, String trustName);

    @Query("SELECT c FROM Customer c WHERE c.customerId = ?1 AND c.trustCode = ?2 AND c.trustName = ?3")
    Customer findByCustomerIdAndTrustCodeAndTrustName(Long customerId, String trustCode, String trustName);

}