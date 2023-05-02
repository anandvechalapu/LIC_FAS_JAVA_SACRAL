package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;

@Repository
public interface GroupCustomerDetailsRepository extends JpaRepository<GroupCustomerDetails, Long> {

    @Query("SELECT g FROM GroupCustomerDetails g WHERE g.groupCustomerId = ?1 AND g.unitCode = ?2")
    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerIdAndUnitCode(Long groupCustomerId, String unitCode);

    @Query("SELECT g FROM GroupCustomerDetails g WHERE g.groupCustomerId = ?1")
    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerId(Long groupCustomerId);
}