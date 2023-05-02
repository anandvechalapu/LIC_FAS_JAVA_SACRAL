package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerContactDetails;

public interface GroupCustomerContactDetailsRepository extends JpaRepository<GroupCustomerContactDetails, Long> {

    GroupCustomerContactDetails findByGroupCustomerId(Long groupCustomerId);

    void updateGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails);

    void addNewGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails);

    void saveGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails);

    void deleteGroupCustomerContactDetails(GroupCustomerContactDetails groupCustomerContactDetails);
}