package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;

@Repository
public interface GroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerDetailsController, Long> {

    public GroupCustomerDetailsController updateGroupStatus(Long id, boolean status, String modifiedBy, String modifiedOn);

}