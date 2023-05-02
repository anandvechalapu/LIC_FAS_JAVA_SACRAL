package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.dto.ContactDetailDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.service.CustomerBasicDetailsTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer/contact")
public class CustomerBasicDetailsTempController {

    @Autowired
    private CustomerBasicDetailsTempService customerBasicDetailsTempService;

    @GetMapping("/{customerId}")
    public CommonResponseDto getContactDetails(@PathVariable Long customerId) {
        return customerBasicDetailsTempService.getContactDetails(customerId);
    }

}