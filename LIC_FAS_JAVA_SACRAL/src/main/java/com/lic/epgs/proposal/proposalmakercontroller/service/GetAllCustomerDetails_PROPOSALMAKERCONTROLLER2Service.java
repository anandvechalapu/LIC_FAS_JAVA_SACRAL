package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.repository.GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Service {

    @Autowired
    private GetAllCustomerDetails_PROPOSALMAKERCONTROLLER2Repository repository;

    public CustomerDetails getCustomerDetailsById(Long customerId){
        return repository.getCustomerDetailsById(customerId);
    }

    public List<CustomerDetails> getAllActiveCustomerDetails(){
        return repository.getAllActiveCustomerDetails();
    }
}