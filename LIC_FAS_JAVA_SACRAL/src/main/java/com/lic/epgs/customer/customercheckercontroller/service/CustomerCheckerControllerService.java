package com.lic.epgs.customer.customercheckercontroller.service;

import com.lic.epgs.customer.customercheckercontroller.repository.CustomerCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class CustomerCheckerControllerService {

  @Autowired
  private CustomerCheckerControllerRepository customerCheckerControllerRepository;

  public CustomerCheckerController findApprovedCustomer() {
    return customerCheckerControllerRepository.findApprovedCustomer();
  }

  public void approveCustomerById(UUID id) {
    customerCheckerControllerRepository.approveCustomerById(id);
  }

  public void setCustomerInactive(UUID id) {
    customerCheckerControllerRepository.setCustomerInactive(id);
  }

  public void updateCustomerData(UUID id, String address, String contactDetails, String migrationData) {
    customerCheckerControllerRepository.updateCustomerData(id, address, contactDetails, migrationData);
  }

}