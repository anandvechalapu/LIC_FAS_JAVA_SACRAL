package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.model.CustomerDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proposalmakercontroller2")
public class GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Controller {

    @Autowired
    private GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Service service;

    @GetMapping("/customerdetails/{customerId}")
    public CustomerDetails getCustomerDetailsById(@PathVariable Long customerId){
        return service.getCustomerDetailsById(customerId);
    }

    @GetMapping("/customerdetails/active")
    public List<CustomerDetails> getAllActiveCustomerDetails(){
        return service.getAllActiveCustomerDetails();
    }
}