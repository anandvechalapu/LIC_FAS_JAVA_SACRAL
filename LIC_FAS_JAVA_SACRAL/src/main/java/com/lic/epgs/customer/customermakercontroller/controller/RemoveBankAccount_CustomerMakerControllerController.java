package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.RemoveBankAccount_CustomerMakerController;
import com.lic.epgs.customer.customermakercontroller.service.RemoveBankAccount_CustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remove-bank-account")
public class RemoveBankAccount_CustomerMakerControllerController {

    @Autowired
    private RemoveBankAccount_CustomerMakerControllerService removeBankAccount_customerMakerControllerService;

    @GetMapping
    public RemoveBankAccount_CustomerMakerController findByCustomerIdAndBankAccountId(@RequestParam Long customerId, @RequestParam Long bankAccountId){
        return removeBankAccount_customerMakerControllerService.findByCustomerIdAndBankAccountId(customerId, bankAccountId);
    }

    @DeleteMapping
    public void deleteByCustomerIdAndBankAccountId(@RequestParam Long customerId, @RequestParam Long bankAccountId){
        removeBankAccount_customerMakerControllerService.deleteByCustomerIdAndBankAccountId(customerId, bankAccountId);
    }

}