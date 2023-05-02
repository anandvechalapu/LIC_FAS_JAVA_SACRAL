package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.dto.ContactDetailDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerBasicDetailsTempRepository extends JpaRepository<ContactDetailDto, Long> {

    CommonResponseDto getContactDetails(Long customerId);

}