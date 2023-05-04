package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerService;

@RestController
public class SubCustomerController {

    @Autowired
    private SubCustomerService subCustomerService;

    @GetMapping("/subcustomer/findByName")
    public SubCustomer findByName(@RequestParam("name") String name) {
        return subCustomerService.findByName(name);
    }

    @GetMapping("/subcustomer/findByCode")
    public SubCustomer findByCode(@RequestParam("code") String code) {
        return subCustomerService.findByCode(code);
    }

    @PostMapping("/subcustomer/save")
    public SubCustomer save(@RequestBody SubCustomer subCustomer) {
        return subCustomerService.save(subCustomer);
    }

    @GetMapping("/subcustomer/deleteByName")
    public void deleteByName(@RequestParam("name") String name) {
        subCustomerService.deleteByName(name);
    }

    @GetMapping("/subcustomer/deleteByCode")
    public void deleteByCode(@RequestParam("code") String code) {
        subCustomerService.deleteByCode(code);
    }

    @PostMapping("/subcustomer/updateSubCustomerMappedDetails")
    public void updateSubCustomerMappedDetails(@RequestBody String name, String code) {
        subCustomerService.updateSubCustomerMappedDetails(name, code);
    }

    @PostMapping("/subcustomer/generateSubCustomerCode")
    public void generateSubCustomerCode(@RequestBody String name) {
        subCustomerService.generateSubCustomerCode(name);
    }

    @PostMapping("/subcustomer/validateSubCustomerName")
    public void validateSubCustomerName(@RequestBody String name) {
        subCustomerService.validateSubCustomerName(name);
    }

}