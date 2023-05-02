package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerGroupCompany;
import com.lic.epgs.customer.customermakercontroller.repository.CustomerGroupCompanyRepository;

@Service
public class CustomerGroupCompanyService {

  @Autowired
  CustomerGroupCompanyRepository customerGroupCompanyRepository;

  public CustomerGroupCompany findByCustomerIdAndGroupId(Integer customerId, Integer groupId) {
    return customerGroupCompanyRepository.findByCustomerIdAndGroupId(customerId, groupId);
  }

  public boolean existsByCustomerIdAndGroupId(Integer customerId, Integer groupId) {
    return customerGroupCompanyRepository.existsByCustomerIdAndGroupId(customerId, groupId);
  }

  public void saveCustomerGroupCompanyDetails(Integer customerId, Integer groupId) {
    CustomerGroupCompany customerGroupCompany = new CustomerGroupCompany();
    customerGroupCompany.setCustomerId(customerId);
    customerGroupCompany.setGroupId(groupId);
    customerGroupCompanyRepository.save(customerGroupCompany);
  }

}