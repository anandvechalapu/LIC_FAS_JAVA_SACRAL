package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;

public interface GroupCustomerDetailsRepository extends JpaRepository<GroupCustomerDetails, Long> {

  @Modifying
  @Query("UPDATE GroupCustomerDetails gcd SET gcd.isActive = false WHERE gcd.groupCustomerId = :groupCustomerId")
  void deleteGroupCustomerDetails(@Param("groupCustomerId") Long groupCustomerId);

}