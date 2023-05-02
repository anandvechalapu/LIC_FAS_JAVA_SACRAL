package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;

@Repository
public interface GroupCustomerNotesDetailsRepository extends JpaRepository<GroupCustomerNotesDetails, Long> {

	public GroupCustomerNotesDetails findByGroupCustomerIdAndDateRange(Long groupCustomerId, String startDate, String endDate);

}