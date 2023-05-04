package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.exception.CustomerNotFoundException;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Service;

@RestController
@RequestMapping("/customers")
public class SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Controller {
  
  @Autowired
  private SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Service searchCustomerDetailsService;

  //Controller method to search for customer details by name
  @GetMapping("/{name}")
  public Customer findByName(@PathVariable String name) {
    return searchCustomerDetailsService.findByName(name);
  }
  
  //Controller method to view necessary information about the customer
  @GetMapping("/{name}/{info}")
  public Customer findByNameAndInfo(@PathVariable String name, @PathVariable String info) {
    return searchCustomerDetailsService.findByNameAndInfo(name, info);
  }
  
  //Controller method to return accurate and up-to-date results
  @GetMapping("/{name}/{latestInfo}")
  public Customer findByNameAndLatestInfo(@PathVariable String name, @PathVariable String latestInfo) {
    return searchCustomerDetailsService.findByNameAndLatestInfo(name, latestInfo);
  }
  
  //Controller method to handle non-unique results
  @GetMapping("/{name}/{nonUniqueResult}")
  public List<Customer> findByNameAndNonUniqueResults(@PathVariable String name, @PathVariable String nonUniqueResult) {
    return searchCustomerDetailsService.findByNameAndNonUniqueResults(name, nonUniqueResult);
  }
  
  //Controller method to handle any persistence exceptions
  @GetMapping("/{name}/{exception}")
  public Customer findByNameAndException(@PathVariable String name, @PathVariable String exception) {
    return searchCustomerDetailsService.findByNameAndException(name, exception);
  }

}