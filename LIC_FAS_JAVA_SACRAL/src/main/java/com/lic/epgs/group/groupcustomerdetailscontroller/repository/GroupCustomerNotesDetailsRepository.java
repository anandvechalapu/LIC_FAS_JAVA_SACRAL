package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;

public interface GroupCustomerNotesDetailsRepository extends JpaRepository<GroupCustomerNotesDetails, Long> {

    @Query("SELECT gcnd FROM GroupCustomerNotesDetails gcnd WHERE gcnd.groupCustomerId = :groupCustomerId AND gcnd.date BETWEEN :startDate AND :endDate")
    public GroupCustomerNotesDetails getGroupCustomerNotesDetailsByGroupCustomerIdAndDateRange(Long groupCustomerId, String startDate, String endDate);

}