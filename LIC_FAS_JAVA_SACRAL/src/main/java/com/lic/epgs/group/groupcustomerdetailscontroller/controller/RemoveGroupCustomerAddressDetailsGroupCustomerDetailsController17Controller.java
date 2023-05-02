package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Model;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Service;

@RestController
@RequestMapping("/groupcustomer/details/removeAddress")
public class RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Controller {

    @Autowired
    private RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Service removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Service;

    @PostMapping
    public ResponseEntity<?> removeGroupCustomerAddressDetails(@RequestBody RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Model removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Model) {
        try {
            return removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Service
                    .removeGroupCustomerAddressDetails(removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Model.getGroupCustomerId(),
                            removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Model.getAddressId());
        } catch (Exception e) {
            return removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Service.handleExceptions(e);
        }
    }
}