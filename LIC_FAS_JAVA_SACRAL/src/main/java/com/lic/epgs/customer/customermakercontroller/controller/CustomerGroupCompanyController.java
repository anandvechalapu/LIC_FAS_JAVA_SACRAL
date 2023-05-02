package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.CustomerGroupCompany;
import com.lic.epgs.customer.customermakercontroller.service.CustomerGroupCompanyService;

@RestController
@RequestMapping("/customerGroupCompany")
public class CustomerGroupCompanyController {

  @Autowired
  CustomerGroupCompanyService customerGroupCompanyService;

  @PostMapping
  public void saveCustomerGroupCompanyDetails(@RequestBody CustomerGroupCompany customerGroupCompany) {
    customerGroupCompanyService.saveCustomerGroupCompanyDetails(customerGroupCompany.getCustomerId(), customerGroupCompany.getGroupId());
  }

}