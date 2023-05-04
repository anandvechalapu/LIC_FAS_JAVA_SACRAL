package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subcustomer")
public class SubCustomerController {

    @Autowired
    private SubCustomerService subCustomerService;

    @GetMapping("/{customerId}")
    public SubCustomer findByCustomerId(@PathVariable Long customerId) {
        return subCustomerService.findByCustomerId(customerId);
    }

    @PostMapping("/")
    public void saveSubCustomerContactDetails(@RequestBody SubCustomer subCustomer) {
        subCustomerService.saveSubCustomerContactDetails(subCustomer);
    }

    @PutMapping("/")
    public void updateSubCustomerContactDetails(@RequestBody SubCustomer subCustomer) {
        subCustomerService.updateSubCustomerContactDetails(subCustomer);
    }

    @DeleteMapping("/")
    public void deleteSubCustomerContactDetails(@RequestBody SubCustomer subCustomer) {
        subCustomerService.deleteSubCustomerContactDetails(subCustomer);
    }

    @GetMapping("/contactType/{contactType}")
    public SubCustomer findByContactType(@PathVariable String contactType) {
        return subCustomerService.findByContactType(contactType);
    }

    @GetMapping("/city/{city}")
    public SubCustomer findByCity(@PathVariable String city) {
        return subCustomerService.findByCity(city);
    }

    @GetMapping("/GCTFlag/{GCTFlag}")
    public SubCustomer findByGCTFlag(@PathVariable String GCTFlag) {
        return subCustomerService.findByGCTFlag(GCTFlag);
    }

    @GetMapping("/departmentName/{departmentName}")
    public SubCustomer findByDepartmentName(@PathVariable String departmentName) {
        return subCustomerService.findByDepartmentName(departmentName);
    }

    @GetMapping("/salutation/{salutation}")
    public SubCustomer findBySalutation(@PathVariable String salutation) {
        return subCustomerService.findBySalutation(salutation);
    }

    @GetMapping("/firstName/{firstName}")
    public SubCustomer findByFirstName(@PathVariable String firstName) {
        return subCustomerService.findByFirstName(firstName);
    }

    @GetMapping("/middleName/{middleName}")
    public SubCustomer findByMiddleName(@PathVariable String middleName) {
        return subCustomerService.findByMiddleName(middleName);
    }

    @GetMapping("/lastName/{lastName}")
    public SubCustomer findByLastName(@PathVariable String lastName) {
        return subCustomerService.findByLastName(lastName);
    }

    @GetMapping("/designation/{designation}")
    public SubCustomer findByDesignation(@PathVariable String designation) {
        return subCustomerService.findByDesignation(designation);
    }

    @GetMapping("/countryCode/{countryCode}")
    public SubCustomer findByCountryCode(@PathVariable String countryCode) {
        return subCustomerService.findByCountryCode(countryCode);
    }

    @GetMapping("/mobileNumber/{mobileNumber}")
    public SubCustomer findByMobileNumber(@PathVariable String mobileNumber) {
        return subCustomerService.findByMobileNumber(mobileNumber);
    }

    @GetMapping("/stdCode/{stdCode}")
    public SubCustomer findByStdCode(@PathVariable String stdCode) {
        return subCustomerService.findByStdCode(stdCode);
    }

    @GetMapping("/landlineNumber/{landlineNumber}")
    public SubCustomer findByLandlineNumber(@PathVariable String landlineNumber) {
        return subCustomerService.findByLandlineNumber(landlineNumber);
