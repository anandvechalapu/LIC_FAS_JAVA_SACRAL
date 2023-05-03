package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GetProposalDetailsForIntegrationRepository extends JpaRepository<ProposalDetails, Long> {

  // Get Proposal Customer Basic Details
  ProposalDetails getProposalCustomerBasicDetails(String proposalNumber);

  // Get Proposal Channel Details
  ProposalDetails getProposalChannelDetails(String proposalNumber);

  // Get Proposal Address, Contact and Bank Details
  ProposalDetails getProposalAddressContactBankDetails(String proposalNumber);

  // Get Proposal Basic Details
  ProposalDetails getProposalBasicDetails(String proposalNumber);

  // Get Success/Failure response with a message
  ProposalDetails getSuccessFailureResponseMessage(String proposalNumber);

}