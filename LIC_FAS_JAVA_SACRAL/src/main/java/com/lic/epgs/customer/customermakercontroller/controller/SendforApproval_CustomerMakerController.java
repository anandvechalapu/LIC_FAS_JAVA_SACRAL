package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerBasicDetailsTemp;
import com.lic.epgs.customer.customermakercontroller.service.SendforApproval_CustomerMakerControllerService;

@RestController
@RequestMapping("/customer")
public class SendforApproval_CustomerMakerController {

    @Autowired
    private SendforApproval_CustomerMakerControllerService sendforApproval_CustomerMakerControllerService;

    @PostMapping("/saveForApproval")
    public ResponseEntity<CustomerBasicDetailsTemp> saveForApproval(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto){
        CustomerBasicDetailsTemp customerBasicDetailsTemp = sendforApproval_CustomerMakerControllerService.saveForApproval(customerBasicDetailsDto);
        return new ResponseEntity<>(customerBasicDetailsTemp, HttpStatus.OK);
    }

    @GetMapping("/findByCustomerId/{customerId}")
    public ResponseEntity<CustomerBasicDetailsDto> findByCustomerId(@PathVariable Long customerId){
        CustomerBasicDetailsDto customerBasicDetailsDto = sendforApproval_CustomerMakerControllerService.findByCustomerId(customerId);
        return new ResponseEntity<>(customerBasicDetailsDto, HttpStatus.OK);
    }

    @GetMapping("/findByCustomerIdAndIsActive/{customerId}/{isActive}")
    public ResponseEntity<CustomerBasicDetailsTemp> findByCustomerIdAndIsActive(@PathVariable Long customerId, @PathVariable boolean isActive){
        CustomerBasicDetailsTemp customerBasicDetailsTemp = sendforApproval_CustomerMakerControllerService.findByCustomerIdAndIsActive(customerId, isActive);
        return new ResponseEntity<>(customerBasicDetailsTemp, HttpStatus.OK);
    }

}