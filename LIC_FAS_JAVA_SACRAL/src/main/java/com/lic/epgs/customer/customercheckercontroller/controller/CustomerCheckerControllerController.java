package com.lic.epgs.customer.customercheckercontroller.controller;

import com.lic.epgs.customer.customercheckercontroller.model.CustomerCheckerController;
import com.lic.epgs.customer.customercheckercontroller.service.CustomerCheckerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class CustomerCheckerControllerController {

  @Autowired
  private CustomerCheckerControllerService customerCheckerControllerService;

  @GetMapping("/customers/approved")
  public CustomerCheckerController getApprovedCustomer() {
    return customerCheckerControllerService.findApprovedCustomer();
  }

  @PutMapping("/customers/{id}/approve")
  public void approveCustomer(@PathVariable UUID id) {
    customerCheckerControllerService.approveCustomerById(id);
  }

  @PutMapping("/customers/{id}/inactive")
  public void setCustomerInactive(@PathVariable UUID id) {
    customerCheckerControllerService.setCustomerInactive(id);
  }

  @PutMapping("/customers/{id}/data")
  public void updateCustomerData(@PathVariable UUID id, @RequestParam String address,
                                 @RequestParam String contactDetails, @RequestParam String migrationData) {
    customerCheckerControllerService.updateCustomerData(id, address, contactDetails, migrationData);
  }

}