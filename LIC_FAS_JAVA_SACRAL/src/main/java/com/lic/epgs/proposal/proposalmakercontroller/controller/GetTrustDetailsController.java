package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetCustomerCheckerResponse;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetTrustDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTrustDetailsController {

    @Autowired
    private GetTrustDetailsService getTrustDetailsService;

    @GetMapping(value = "/getTrustDetails")
    public GetCustomerCheckerResponse getTrustDetailsByTrustId(@RequestParam(value = "trustId") Long trustId){
        return getTrustDetailsService.getTrustDetailsByTrustId(trustId);
    }

}