package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.dto.BankAccountDetailsDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetBankAccountDetails_CustomerMakerControllerRepository extends JpaRepository<BankAccountDetailsDto, Long> {

    @Query("SELECT b FROM BankAccountDetailsDto b WHERE b.customerId = :customerId")
    List<BankAccountDetailsDto> getBankAccountDetailsByCustomerId(Long customerId);

}