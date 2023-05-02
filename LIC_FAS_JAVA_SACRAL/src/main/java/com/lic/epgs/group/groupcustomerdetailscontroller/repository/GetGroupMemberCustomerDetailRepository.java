package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;

@Repository
public interface GetGroupMemberCustomerDetailRepository extends JpaRepository<GroupCustomerDetailsController, Integer> {

    GroupCustomerDetailsController findByCustomerCodeAndGroupCustomerId(String customerCode, int groupCustomerId);

}