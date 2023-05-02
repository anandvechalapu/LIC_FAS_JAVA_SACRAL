package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.dto.ContactDetailDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.repository.CustomerBasicDetailsTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBasicDetailsTempService {

    @Autowired
    private CustomerBasicDetailsTempRepository customerBasicDetailsTempRepository;

    public CommonResponseDto getContactDetails(Long customerId) {
        ContactDetailDto contactDetailDto = customerBasicDetailsTempRepository.getContactDetails(customerId);

        CommonResponseDto commonResponseDto = new CommonResponseDto();
        commonResponseDto.setData(contactDetailDto);
        commonResponseDto.setStatus("SUCCESS");
        return commonResponseDto;
    }

}