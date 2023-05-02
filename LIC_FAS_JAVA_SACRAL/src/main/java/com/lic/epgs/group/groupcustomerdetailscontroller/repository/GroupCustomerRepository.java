package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;

@Repository
public interface GroupCustomerRepository extends JpaRepository<GroupCustomer, Long> {
 
    GroupCustomer findByGroupCustomerId(Long groupCustomerId);
    
    List<GroupCustomer> findByStatus(String status);
    
    List<GroupCustomer> findByGroupCustomerIdAndStatus(Long groupCustomerId, String status);
    
    void deleteByGroupCustomerIdAndStatus(Long groupCustomerId, String status);
    
    void deleteByGroupCustomerId(Long groupCustomerId);
}