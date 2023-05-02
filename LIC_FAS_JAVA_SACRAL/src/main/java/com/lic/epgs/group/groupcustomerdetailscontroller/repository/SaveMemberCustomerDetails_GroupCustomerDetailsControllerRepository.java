package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;

@Repository
public interface SaveMemberCustomerDetails_GroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerDetails, Long> {

    GroupCustomerDetails findByCustomerCodeAndGroupCustomerId(String customerCode, Long groupCustomerId);
    
    GroupCustomerDetails save(GroupCustomerDetails groupCustomerDetails);

}