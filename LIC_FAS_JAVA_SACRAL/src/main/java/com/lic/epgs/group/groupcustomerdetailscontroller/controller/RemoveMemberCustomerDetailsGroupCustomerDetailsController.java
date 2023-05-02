package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.Customer;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.RemoveMemberCustomerDetailsGroupCustomerDetailsControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class RemoveMemberCustomerDetailsGroupCustomerDetailsController {

    @Autowired
    private RemoveMemberCustomerDetailsGroupCustomerDetailsControllerService service;

    @GetMapping("/{customerCode}")
    public Customer findByCustomerCode(@PathVariable String customerCode) {
        return service.findByCustomerCode(customerCode);
    }

    @GetMapping("/group/{groupId}")
    public List<Customer> findByGroupId(@PathVariable long groupId) {
        return service.findByGroupId(groupId);
    }

    @PostMapping("/remove-member/{customerCode}")
    public int removeMemberCustomerFromGroup(@PathVariable String customerCode) {
        return service.removeMemberCustomerFromGroup(customerCode);
    }

}