package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;

@Repository
public interface SearchCustomerdetailsbyName_SUBCUSTOMERMAKERCONTROLLER19Repository extends JpaRepository<Customer, Long> {
  //Method to search for customer details by name
  public Customer findByName(String name);
  
  //Method to view necessary information about the customer
  public Customer findByNameAndInfo(String name, String info);
  
  //Method to return accurate and up-to-date results
  public Customer findByNameAndLatestInfo(String name, String latestInfo);
  
  //Method to handle non-unique results
  public List<Customer> findByNameAndNonUniqueResults(String name, String nonUniqueResult);
  
  //Method to handle any persistence exceptions
  public Customer findByNameAndException(String name, String exception);
  
}