package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GetGroupMemberCustomerDetailsService;

@RestController
@RequestMapping("/group-customer-details")
public class GroupCustomerDetailsController {

    @Autowired
    private GetGroupMemberCustomerDetailsService getGroupMemberCustomerDetailsService;

    @GetMapping("/{customerCode}/{groupCustomerId}")
    public List<GroupCustomerDetailsController> getGroupMemberCustomerDetails(@PathVariable String customerCode,
                                                                            @PathVariable int groupCustomerId) {
        return getGroupMemberCustomerDetailsService.getGroupMemberCustomerDetails(customerCode, groupCustomerId);
    }
}