package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerContactPerson;
import com.lic.epgs.customer.customermakercontroller.service.RemoveCustomerContactPersonDetails_CustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerContactPersonController {

    @Autowired
    private RemoveCustomerContactPersonDetails_CustomerMakerControllerService removeCustomerContactPersonDetails_customerMakerControllerService;

    @GetMapping("/contactperson")
    public ResponseEntity<CustomerContactPerson> getCustomerContactPersonByCustomerIdAndContactPersonId(@RequestParam Long customerId, @RequestParam Long contactPersonId){
        return new ResponseEntity<CustomerContactPerson>(removeCustomerContactPersonDetails_customerMakerControllerService.findByCustomerIdAndContactPersonId(customerId, contactPersonId), HttpStatus.OK);
    }

    @DeleteMapping("/contactperson")
    public ResponseEntity<String> deleteCustomerContactPersonByCustomerIdAndContactPersonId(@RequestParam Long customerId, @RequestParam Long contactPersonId){
        removeCustomerContactPersonDetails_customerMakerControllerService.deleteByCustomerIdAndContactPersonId(customerId, contactPersonId);
        return new ResponseEntity<String>("Customer Contact Person deleted successfully", HttpStatus.OK);
    }
}