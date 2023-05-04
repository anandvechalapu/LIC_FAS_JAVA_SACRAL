package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.RemoveSubCustomerContactDetailsService;

@RestController
public class SubCustomerMakerController {
    
    @Autowired
    private RemoveSubCustomerContactDetailsService removeSubCustomerContactDetailsService;
    
    @RequestMapping(method = RequestMethod.POST, path = "/removeSubCustomerContactDetails")
    public SubCustomerMakerController removeSubCustomerContactDetails(@RequestParam Long subCustomerId, @RequestParam Long contactPersonId) {
        SubCustomerMakerController subCustomerMakerController = new SubCustomerMakerController();
        removeSubCustomerContactDetailsService.removeSubCustomerContactDetails(subCustomerId, contactPersonId);
        subCustomerMakerController.setSubCustomerId(subCustomerId);
        subCustomerMakerController.setContactPersonId(contactPersonId);
        Boolean contactDetailStatus = removeSubCustomerContactDetailsService.updateContactDetailsStatus(subCustomerId, contactPersonId);
        subCustomerMakerController.setContactDetailStatus(contactDetailStatus);
        subCustomerMakerController.setSuccessMessage(removeSubCustomerContactDetailsService.getSuccessMessage(subCustomerId, contactPersonId));
        subCustomerMakerController.setErrorMessage(removeSubCustomerContactDetailsService.getErrorMessage(subCustomerId, contactPersonId));
        return subCustomerMakerController;
    }

}