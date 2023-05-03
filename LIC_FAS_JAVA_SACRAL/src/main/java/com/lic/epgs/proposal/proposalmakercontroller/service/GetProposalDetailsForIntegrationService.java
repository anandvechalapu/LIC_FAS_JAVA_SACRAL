package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.repository.GetProposalDetailsForIntegrationRepository;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProposalDetailsForIntegrationService {

  @Autowired
  private GetProposalDetailsForIntegrationRepository getProposalDetailsForIntegrationRepository;

  // Get Proposal Customer Basic Details
  public ProposalDetails getProposalCustomerBasicDetails(String proposalNumber) {
    return getProposalDetailsForIntegrationRepository.getProposalCustomerBasicDetails(proposalNumber);
  }

  // Get Proposal Channel Details
  public ProposalDetails getProposalChannelDetails(String proposalNumber) {
    return getProposalDetailsForIntegrationRepository.getProposalChannelDetails(proposalNumber);
  }

  // Get Proposal Address, Contact and Bank Details
  public ProposalDetails getProposalAddressContactBankDetails(String proposalNumber) {
    return getProposalDetailsForIntegrationRepository.getProposalAddressContactBankDetails(proposalNumber);
  }

  // Get Proposal Basic Details
  public ProposalDetails getProposalBasicDetails(String proposalNumber) {
    return getProposalDetailsForIntegrationRepository.getProposalBasicDetails(proposalNumber);
  }

  // Get Success/Failure response with a message
  public ProposalDetails getSuccessFailureResponseMessage(String proposalNumber) {
    return getProposalDetailsForIntegrationRepository.getSuccessFailureResponseMessage(proposalNumber);
  }

}