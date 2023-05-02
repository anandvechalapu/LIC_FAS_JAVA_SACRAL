package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerMakerController;
import com.lic.epgs.customer.customermakercontroller.service.CustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerMakerControllerController {

    @Autowired
    private CustomerMakerControllerService customerMakerControllerService;

    @GetMapping("/customer/search")
    public CommonResponseDto searchCustomerdetailsbyName(@RequestParam String customerName) {
        return customerMakerControllerService.searchCustomerdetailsbyName(customerName);
    }
}