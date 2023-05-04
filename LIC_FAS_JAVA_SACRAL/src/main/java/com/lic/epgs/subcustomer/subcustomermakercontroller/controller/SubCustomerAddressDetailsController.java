package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerAddressDetailsDto;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerAddressDetailsService;

@RestController
@RequestMapping("/sub-customer-address-details")
public class SubCustomerAddressDetailsController {

    @Autowired
    SubCustomerAddressDetailsService subCustomerAddressDetailsService;

    @GetMapping("/{subCustomerId}")
    public ResponseEntity<List<SubCustomerAddressDetailsDto>> getSubCustomerAddressDetailsBySubCustomerId(@PathVariable("subCustomerId") Long subCustomerId) {
        return new ResponseEntity<>(subCustomerAddressDetailsService.getSubCustomerAddressDetailsBySubCustomerId(subCustomerId), HttpStatus.OK);
    }

    @GetMapping("/{subAddressId}/{subCustomerId}")
    public ResponseEntity<SubCustomerAddressDetailsDto> getSubCustomerAddressDetailsBySubAddressIdAndSubCustomerId(@PathVariable("subAddressId") Long subAddressId, @PathVariable("subCustomerId") Long subCustomerId) {
        return new ResponseEntity<>(subCustomerAddressDetailsService.getSubCustomerAddressDetailsBySubAddressIdAndSubCustomerId(subAddressId, subCustomerId), HttpStatus.OK);
    }

}