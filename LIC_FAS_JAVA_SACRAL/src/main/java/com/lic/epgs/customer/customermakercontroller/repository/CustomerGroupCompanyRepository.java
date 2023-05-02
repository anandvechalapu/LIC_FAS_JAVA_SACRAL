package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerGroupCompany;

public interface CustomerGroupCompanyRepository extends JpaRepository<CustomerGroupCompany, Long> {

  public CustomerGroupCompany findByCustomerIdAndGroupId(Integer customerId, Integer groupId);

  public boolean existsByCustomerIdAndGroupId(Integer customerId, Integer groupId);
  
  public void saveCustomerGroupCompanyDetails(Integer customerId, Integer groupId);

}