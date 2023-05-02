package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.customer.customermakercontroller.repository.GetCustomerGroupDetails_CustomerMakerControllerRepository;
import com.lic.epgs.dto.CommonResponseDto;

@Service
public class GetCustomerGroupDetails_CustomerMakerControllerService {

    @Autowired
    private GetCustomerGroupDetails_CustomerMakerControllerRepository getCustomerGroupDetailsRepository;

    public CommonResponseDto getCustomerGroupDetails(String groupCode) {

        try {
            return getCustomerGroupDetailsRepository.getCustomerGroupDetails(groupCode);
        } catch (Exception e) {
            return getCustomerGroupDetailsRepository.handleError(e.getMessage());
        }
    }

}