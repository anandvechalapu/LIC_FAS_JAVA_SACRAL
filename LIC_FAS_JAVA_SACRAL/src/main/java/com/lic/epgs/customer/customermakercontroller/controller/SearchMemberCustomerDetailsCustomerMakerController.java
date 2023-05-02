package com.lic.epgs.customer.customermakercontroller.controller;

import java.util.Optional;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerEntity;
import com.lic.epgs.customer.customermakercontroller.service.SearchMemberCustomerDetailsCustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SearchMemberCustomerDetailsCustomerMakerController {

    @Autowired
    private SearchMemberCustomerDetailsCustomerMakerControllerService searchMemberCustomerDetailsCustomerMakerControllerService;

    @GetMapping("/search/customer/{customerCode}/{customerName}/{trustName}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerCodeAndCustomerNameAndTrustName(@PathVariable String customerCode,
                                                                                                      @PathVariable String customerName,
                                                                                                      @PathVariable String trustName) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerCodeAndCustomerNameAndTrustName(customerCode, 
                                                                                                                                                             customerName, 
                                                                                                                                                             trustName);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

    @GetMapping("/search/customer/{customerName}/{trustName}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerNameAndTrustName(@PathVariable String customerName,
                                                                                        @PathVariable String trustName) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerNameAndTrustName(customerName, 
                                                                                                                                             trustName);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

    @GetMapping("/search/customer/{customerCode}/{trustName}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerCodeAndTrustName(@PathVariable String customerCode,
                                                                                        @PathVariable String trustName) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerCodeAndTrustName(customerCode, 
                                                                                                                                             trustName);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

    @GetMapping("/search/customer/{customerCode}/{customerName}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerCodeAndCustomerName(@PathVariable String customerCode,
                                                                                          @PathVariable String customerName) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerCodeAndCustomerName(customerCode, 
                                                                                                                                               customerName);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

    @GetMapping("/search/customer/{customerCode}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerCode(@PathVariable String customerCode) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerCode(customerCode);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

    @GetMapping("/search/customer/{customerName}")
    public ResponseEntity<Optional<List<CustomerEntity>>> findByCustomerName(@PathVariable String customerName) {
        Optional<List<CustomerEntity>> customerEntity = searchMemberCustomerDetailsCustomerMakerControllerService.findByCustomerName(customerName);
        return new ResponseEntity<>(customerEntity, HttpStatus.OK);
    }

