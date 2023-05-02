package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.model.ExistingCustomerSearch;

@Repository
public interface ExistingCustomerSearch_CustomerMakerControllerRepository extends JpaRepository<ExistingCustomerSearch, Long> {

    @Query("SELECT c FROM ExistingCustomerSearch c WHERE c.roleType = :roleType AND c.unitCode = :unitCode ORDER BY c.modifiedDate DESC")
    ExistingCustomerSearch getExistingCustomer(String roleType, String unitCode);

}