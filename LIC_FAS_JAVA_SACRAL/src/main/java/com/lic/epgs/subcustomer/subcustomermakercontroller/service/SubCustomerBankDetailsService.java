package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerBankDetails;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerBankDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCustomerBankDetailsService {

  @Autowired
  private SubCustomerBankDetailsRepository subCustomerBankDetailsRepository;

  public SubCustomerBankDetails save(SubCustomerBankDetails subCustomerBankDetails){
    return subCustomerBankDetailsRepository.save(subCustomerBankDetails);
  }

  public SubCustomerBankDetails findById(Long id){
    return subCustomerBankDetailsRepository.findById(id);
  }

  public void deleteById(Long id){
    subCustomerBankDetailsRepository.deleteById(id);
  }

  public SubCustomerBankDetails findByAccountNumber(String accountNumber){
    return subCustomerBankDetailsRepository.findByAccountNumber(accountNumber);
  }

}