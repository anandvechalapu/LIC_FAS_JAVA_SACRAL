package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.service.GetCustomerGroupDetails_CustomerMakerControllerService;
import com.lic.epgs.dto.CommonResponseDto;

@RestController
public class GetCustomerGroupDetails_CustomerMakerController {

    @Autowired
    private GetCustomerGroupDetails_CustomerMakerControllerService getCustomerGroupDetailsService;

    @GetMapping("/customer/group/{groupCode}")
    public CommonResponseDto getCustomerGroupDetails(@PathVariable String groupCode) {
        return getCustomerGroupDetailsService.getCustomerGroupDetails(groupCode);
    }

}