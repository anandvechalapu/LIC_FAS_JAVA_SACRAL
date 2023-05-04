package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.MasterSubcustomerDetails;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.GetMasterSubcustomerDetails_SubCustomerMakerControllerService;

@RestController
public class GetMasterSubcustomerDetails_SubCustomerMakerController {

    @Autowired
    GetMasterSubcustomerDetails_SubCustomerMakerControllerService getMasterSubcustomerDetails_SubCustomerMakerControllerService;

    // Retrieve master subcustomer details
    @GetMapping("/getBySubcustomerName")
    public List<MasterSubcustomerDetails> getBySubcustomerName(@RequestParam String subcustomerName) {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerService.getBySubcustomerName(subcustomerName);
    }

    // Retrieve master subcustomer details when the subcustomer status is approved
    @GetMapping("/getBySubcustomerStatus")
    public Optional<MasterSubcustomerDetails> getBySubcustomerStatus() {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerService.getBySubcustomerStatus();
    }

    // Retrieve master subcustomer details when the ‘isActive’ is set to true
    @GetMapping("/getByIsActive")
    public Optional<MasterSubcustomerDetails> getByIsActive() {
        return getMasterSubcustomerDetails_SubCustomerMakerControllerService.getByIsActive();
    }

}