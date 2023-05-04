package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.SubCustomerCheckerControllerService;

@RestController
@RequestMapping("/subcustomer")
public class SubCustomerCheckerController {

    @Autowired
    private SubCustomerCheckerControllerService service;

    @GetMapping("/")
    public ResponseEntity<SubCustomer> getSubCustomerByCustomerId(@RequestParam("customerId") Long customerId) {
        SubCustomer subCustomer = service.findSubCustomerByCustomerId(customerId);
        if(subCustomer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(subCustomer);
    }

    @PutMapping("/")
    public ResponseEntity<SubCustomer> updateSubCustomer(@RequestBody SubCustomer subCustomer) {
        SubCustomer updatedSubCustomer = service.updateSubCustomer(subCustomer.getAddress(), subCustomer.getContact(), subCustomer.getNotes(), subCustomer.getBankAccountDetails(), subCustomer.getCustomerId());
        if(updatedSubCustomer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedSubCustomer);
    }

}