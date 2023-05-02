package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.dtos.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.RemoveGroupCustomerBankService;

@RestController
@RequestMapping("/group")
public class GroupCustomerBankController {
    private final RemoveGroupCustomerBankService removeGroupCustomerBankService;

    @Autowired
    public GroupCustomerBankController(RemoveGroupCustomerBankService removeGroupCustomerBankService) {
        this.removeGroupCustomerBankService = removeGroupCustomerBankService;
    }

    @DeleteMapping("/removeGroupCustomerBank/{groupCustomerId}/{bankAccountId}")
    public CommonResponseDto removeGroupCustomerBank(@PathVariable String groupCustomerId, @PathVariable String bankAccountId) {
        return this.removeGroupCustomerBankService.removeGroupCustomerBank(groupCustomerId, bankAccountId);
    }
    
}