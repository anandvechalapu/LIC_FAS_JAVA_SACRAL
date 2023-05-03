package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetProposalDetailsForIntegrationService;

@RestController
@RequestMapping("/proposal")
public class ProposalMakerController {

  @Autowired
  private GetProposalDetailsForIntegrationService getProposalDetailsForIntegrationService;

  // Get Proposal Customer Basic Details
  @GetMapping("/customer/{proposalNumber}")
  public ProposalDetails getProposalCustomerBasicDetails(@PathVariable String proposalNumber) {
    return getProposalDetailsForIntegrationService.getProposalCustomerBasicDetails(proposalNumber);
  }

  // Get Proposal Channel Details
  @GetMapping("/channel/{proposalNumber}")
  public ProposalDetails getProposalChannelDetails(@PathVariable String proposalNumber) {
    return getProposalDetailsForIntegrationService.getProposalChannelDetails(proposalNumber);
  }

  // Get Proposal Address, Contact and Bank Details
  @GetMapping("/contact/{proposalNumber}")
  public ProposalDetails getProposalAddressContactBankDetails(@PathVariable String proposalNumber) {
    return getProposalDetailsForIntegrationService.getProposalAddressContactBankDetails(proposalNumber);
  }

  // Get Proposal Basic Details
  @GetMapping("/basic/{proposalNumber}")
  public ProposalDetails getProposalBasicDetails(@PathVariable String proposalNumber) {
    return getProposalDetailsForIntegrationService.getProposalBasicDetails(proposalNumber);
  }

  // Get Success/Failure response with a message
  @GetMapping("/response/{proposalNumber}")
  public ProposalDetails getSuccessFailureResponseMessage(@PathVariable String proposalNumber) {
    return getProposalDetailsForIntegrationService.getSuccessFailureResponseMessage(proposalNumber);
  }

}