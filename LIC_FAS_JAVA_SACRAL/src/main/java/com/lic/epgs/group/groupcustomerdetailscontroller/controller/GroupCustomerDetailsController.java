package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerAddressDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;

@RestController
@RequestMapping("/group_customer_address_details")
public class GroupCustomerDetailsController {
    
    @Autowired
    private GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;
    
    @GetMapping("/group_address_id/{groupAddressId}/group_customer_id/{groupCustomerId}")
    public List<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupAddressIdAndGroupCustomerId(@PathVariable Long groupAddressId, @PathVariable Long groupCustomerId) {
        return groupCustomerDetailsControllerService.getGroupCustomerAddressDetailsByGroupAddressIdAndGroupCustomerId(groupAddressId, groupCustomerId);
    }
    
    @GetMapping("/group_customer_id/{groupCustomerId}")
    public List<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupCustomerId(@PathVariable Long groupCustomerId) {
        return groupCustomerDetailsControllerService.getGroupCustomerAddressDetailsByGroupCustomerId(groupCustomerId);
    }
    
    @GetMapping("/group_customer_id/{groupCustomerId}/address_id/{addressId}")
    public Optional<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupCustomerIdAndAddressId(@PathVariable Long groupCustomerId, @PathVariable Long addressId) {
        return groupCustomerDetailsControllerService.getGroupCustomerAddressDetailsByGroupCustomerIdAndAddressId(groupCustomerId, addressId);
    }
    
}