package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GroupCustomerDetailsControllerRepository extends JpaRepository<CommonResponseDto, Long> {

    @Query("SELECT g.groupId, g.groupName, g.trustId, t.trustName, t.trustType, c.customerId, c.name, c.address FROM Group g LEFT JOIN Trust t ON g.trustId = t.trustId LEFT JOIN Customer c ON g.customerId = c.customerId WHERE g.groupId = ?1")
    CommonResponseDto getGroupBasicDetails_GROUP_CUSTOMER_DETAILS_CONTROLLER(Long groupId, int pageCount, int limit);

}