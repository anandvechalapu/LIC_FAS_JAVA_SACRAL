package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerBankDetails;

public interface SubCustomerBankDetailsRepository extends JpaRepository<SubCustomerBankDetails, Long> {

  SubCustomerBankDetails save(SubCustomerBankDetails subCustomerBankDetails);
  
  SubCustomerBankDetails findById(Long id);

  void deleteById(Long id);
  
  SubCustomerBankDetails findByAccountNumber(String accountNumber);

}