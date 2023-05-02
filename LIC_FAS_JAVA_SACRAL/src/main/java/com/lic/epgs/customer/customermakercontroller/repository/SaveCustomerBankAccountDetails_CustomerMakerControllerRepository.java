package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.entity.CustomerBankAccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SaveCustomerBankAccountDetails_CustomerMakerControllerRepository extends JpaRepository<CustomerBankAccountDetails, Long> {

    @Query("SELECT c FROM CustomerBankAccountDetails c WHERE c.customerId = :customerId")
    CustomerBankAccountDetails findByCustomerId(@Param("customerId") Long customerId);

    @Modifying
    @Transactional
    @Query("UPDATE CustomerBankAccountDetails c SET c.accountNumber = :accountNumber, c.accountType = :accountType, c.bankName = :bankName, c.ifscCode = :ifscCode, c.branchName = :branchName WHERE c.customerId = :customerId")
    int updateCustomerBankAccountDetails(@Param("customerId") Long customerId, @Param("accountNumber") String accountNumber, @Param("accountType") String accountType, @Param("bankName") String bankName, @Param("ifscCode") String ifscCode, @Param("branchName") String branchName);

    @Transactional
    CommonResponseDto saveCustomerBankAccountDetails(CustomerBankAccountDetails customerBankAccountDetails);

}