package com.lic.epgs.customer.customermakercontroller.controller;

import java.util.List;

import com.lic.epgs.customer.customermakercontroller.dto.BankAccountDetailsDto;
import com.lic.epgs.customer.customermakercontroller.service.GetBankAccountDetails_CustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/maker/controller")
public class GetBankAccountDetails_CustomerMakerController {

    @Autowired
    private GetBankAccountDetails_CustomerMakerControllerService getBankAccountDetails_customerMakerControllerService;

    @GetMapping("/bank-account-details/{customerId}")
    public List<BankAccountDetailsDto> getBankAccountDetailsByCustomerId(@PathVariable Long customerId) {
        return getBankAccountDetails_customerMakerControllerService.getBankAccountDetailsByCustomerId(customerId);
    }

}