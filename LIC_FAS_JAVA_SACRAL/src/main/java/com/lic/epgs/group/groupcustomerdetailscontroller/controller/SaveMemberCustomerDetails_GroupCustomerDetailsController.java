package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.SaveMemberCustomerDetails_GroupCustomerDetailsControllerService;

@RestController
@RequestMapping("/api/v1/groupcustomerdetails")
public class SaveMemberCustomerDetails_GroupCustomerDetailsController {

    @Autowired
    private SaveMemberCustomerDetails_GroupCustomerDetailsControllerService saveMemberCustomerDetails_GroupCustomerDetailsControllerService;

    @GetMapping("/{customerCode}/{groupCustomerId}")
    public GroupCustomerDetails getGroupCustomerDetailsByCustomerCodeAndGroupCustomerId(@PathVariable String customerCode, @PathVariable Long groupCustomerId) {
        return saveMemberCustomerDetails_GroupCustomerDetailsControllerService.findByCustomerCodeAndGroupCustomerId(customerCode, groupCustomerId).get();
    } 

    @PostMapping
    public GroupCustomerDetails saveGroupCustomerDetails(@RequestBody GroupCustomerDetails groupCustomerDetails) {
        return saveMemberCustomerDetails_GroupCustomerDetailsControllerService.save(groupCustomerDetails);
    }

}