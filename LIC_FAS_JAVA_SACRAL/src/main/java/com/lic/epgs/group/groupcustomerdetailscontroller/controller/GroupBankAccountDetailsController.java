package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupBankAccountDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupBankAccountDetailsService;

@RestController
public class GroupBankAccountDetailsController {

    @Autowired
    GroupBankAccountDetailsService groupBankAccountDetailsService;

    @GetMapping("/getGroupBankAccountDetails")
    public GroupBankAccountDetails getGroupBankAccountDetails(@RequestParam long groupCustomerId) {
        return groupBankAccountDetailsService.getGroupBankAccountDetails(groupCustomerId);
    }

    @PostMapping("/saveGroupBankAccountDetails")
    public void saveGroupBankAccountDetails(@RequestBody GroupBankAccountDetails groupBankAccountDetails) {
        groupBankAccountDetailsService.saveGroupBankAccountDetails(groupBankAccountDetails);
    }

    @PutMapping("/updateGroupBankAccountDetails")
    public void updateGroupBankAccountDetails(@RequestBody GroupBankAccountDetails groupBankAccountDetails) {
        groupBankAccountDetailsService.saveGroupBankAccountDetails(groupBankAccountDetails);
    }

    @DeleteMapping("/deleteGroupBankAccountDetails")
    public void deleteGroupBankAccountDetails(@RequestBody GroupBankAccountDetails groupBankAccountDetails) {
        groupBankAccountDetailsService.deleteGroupBankAccountDetails(groupBankAccountDetails);
    }

    @DeleteMapping("/deleteGroupBankAccountDetailsByGroupCustomerId")
    public void deleteGroupBankAccountDetailsByGroupCustomerId(@RequestParam long groupCustomerId) {
        groupBankAccountDetailsService.deleteGroupBankAccountDetailsByGroupCustomerId(groupCustomerId);
    }

}