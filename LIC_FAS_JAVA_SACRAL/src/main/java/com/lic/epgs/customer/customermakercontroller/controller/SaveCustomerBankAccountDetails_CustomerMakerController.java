package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.entity.CustomerBankAccountDetails;
import com.lic.epgs.customer.customermakercontroller.service.SaveCustomerBankAccountDetails_CustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class SaveCustomerBankAccountDetails_CustomerMakerController {

    @Autowired
    SaveCustomerBankAccountDetails_CustomerMakerControllerService saveCustomerBankAccountDetails_customerMakerControllerService;

    @PostMapping("/saveCustomerBankAccountDetails")
    public CommonResponseDto saveCustomerBankAccountDetails(@RequestBody CustomerBankAccountDetails customerBankAccountDetails) {
        return saveCustomerBankAccountDetails_customerMakerControllerService.saveCustomerBankAccountDetails(customerBankAccountDetails);
    }

}