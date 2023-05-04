package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomerCheckerController;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.SubCustomerCheckerControllerService;

@RestController
@RequestMapping("/subcustomer")
public class SubCustomerCheckerControllerController {

    @Autowired
    private SubCustomerCheckerControllerService subCustomerCheckerControllerService;

    @GetMapping("/getExitingSubCustomerDetails")
    public SubCustomerCheckerController getExitingSubCustomerDetails(@RequestParam String subCustomerId) {
        return subCustomerCheckerControllerService.getExitingSubCustomerDetails(subCustomerId);
    }

}