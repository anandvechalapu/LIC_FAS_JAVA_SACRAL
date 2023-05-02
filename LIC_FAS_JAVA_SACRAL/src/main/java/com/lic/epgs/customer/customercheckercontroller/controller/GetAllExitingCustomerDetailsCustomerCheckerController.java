package com.lic.epgs.customer.customercheckercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.model.CustomerDetails;
import com.lic.epgs.customer.customercheckercontroller.service.GetAllExitingCustomerDetailsCustomerCheckerControllerService;

@RestController
@RequestMapping("/customer-checker")
public class GetAllExitingCustomerDetailsCustomerCheckerController {

    @Autowired
    GetAllExitingCustomerDetailsCustomerCheckerControllerService getAllExitingCustomerDetailsCustomerCheckerControllerService;

    @GetMapping("/getAllExitingCustomerDetails/{customerID}")
    public ResponseEntity<Object> getAllExitingCustomerDetails(@PathVariable("customerID") Integer customerID) {
        Optional<CustomerDetails> customerDetails = getAllExitingCustomerDetailsCustomerCheckerControllerService.getAllExitingCustomerDetails(customerID);
        if (customerDetails.isPresent()) {
            return new ResponseEntity<>(customerDetails, HttpStatus.OK);
        } else {
            Optional<String> errorMessage = getAllExitingCustomerDetailsCustomerCheckerControllerService.getInvalidInactiveCustomerErrorMessage(customerID);
            if (errorMessage.isPresent()) {
                return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>("Customer details not found", HttpStatus.NOT_FOUND);
            }
        }
    }

    @GetMapping("/getCustomerDetails/{customerID}")
    public ResponseEntity<Object> getCustomerDetails(@PathVariable("customerID") Integer customerID) {
        Optional<CustomerDetails> customerDetails = getAllExitingCustomerDetailsCustomerCheckerControllerService.getCustomerDetails(customerID);
        if (customerDetails.isPresent()) {
            return new ResponseEntity<>(customerDetails, HttpStatus.OK);
        } else {
            Optional<String> errorMessage = getAllExitingCustomerDetailsCustomerCheckerControllerService.getInvalidInactiveCustomerErrorMessage(customerID);
            if (errorMessage.isPresent()) {
                return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>("Customer details not found", HttpStatus.NOT_FOUND);
            }
        }
    }

    @GetMapping("/getResultStatusMessage/{customerID}")
    public ResponseEntity<Object> getResultStatusMessage(@PathVariable("customerID") Integer customerID) {
        Optional<String> resultStatusMessage = getAllExitingCustomerDetailsCustomerCheckerControllerService.getResultStatusMessage(customerID);
        if (resultStatusMessage.isPresent()) {
            return new ResponseEntity<>(resultStatusMessage, HttpStatus.OK);
        } else {
            Optional<String> errorMessage = getAllExitingCustomerDetailsCustomerCheckerControllerService.getInvalidInactiveCustomerErrorMessage(customerID);
            if (errorMessage.isPresent()) {
                return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>("Customer details not found", HttpStatus.NOT_FOUND);
            }
        }
    }
}