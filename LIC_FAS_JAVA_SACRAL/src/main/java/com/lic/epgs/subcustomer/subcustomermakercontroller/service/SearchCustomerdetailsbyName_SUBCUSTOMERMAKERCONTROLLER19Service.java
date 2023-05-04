package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.exception.CustomerNotFoundException;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Repository;

@Service
public class SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Service {

  @Autowired
  private SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Repository searchCustomerDetailsRepository;

  //Method to search for customer details by name
  public Customer findByName(String name) {
    Customer customer = searchCustomerDetailsRepository.findByName(name);
    if (customer == null) {
      throw new CustomerNotFoundException("Customer with name : " + name + " is not found");
    }
    return customer;
  }
  
  //Method to view necessary information about the customer
  public Customer findByNameAndInfo(String name, String info) {
    Customer customer = searchCustomerDetailsRepository.findByNameAndInfo(name, info);
    if (customer == null) {
      throw new CustomerNotFoundException("Customer with name : " + name + " and info : " + info + " is not found");
    }
    return customer;
  }
  
  //Method to return accurate and up-to-date results
  public Customer findByNameAndLatestInfo(String name, String latestInfo) {
    Customer customer = searchCustomerDetailsRepository.findByNameAndLatestInfo(name, latestInfo);
    if (customer == null) {
      throw new CustomerNotFoundException("Customer with name : " + name + " and latest info : " + latestInfo + " is not found");
    }
    return customer;
  }
  
  //Method to handle non-unique results
  public List<Customer> findByNameAndNonUniqueResults(String name, String nonUniqueResult) {
    List<Customer> customerList = searchCustomerDetailsRepository.findByNameAndNonUniqueResults(name, nonUniqueResult);
    if (customerList == null || customerList.size() == 0) {
      throw new CustomerNotFoundException("No customers with name : " + name + " and non unique result : " + nonUniqueResult + " is not found");
    }
    return customerList;
  }
  
  //Method to handle any persistence exceptions
  public Customer findByNameAndException(String name, String exception) {
    Customer customer = searchCustomerDetailsRepository.findByNameAndException(name, exception);
    if (customer == null) {
      throw new CustomerNotFoundException("Customer with name : " + name + " and exception : " + exception + " is not found");
    }
    return customer;
  }

}