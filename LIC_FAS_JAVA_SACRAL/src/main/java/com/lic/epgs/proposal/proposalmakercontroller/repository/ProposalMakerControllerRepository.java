package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalChannelDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.MphDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.CustomerDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.SubCustomerDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.CustomerTrustDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.GroupCustomerBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalNotesDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.BankAccountDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ContactDetailDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.AddressDetailsDto;

@Repository
public interface ProposalMakerControllerRepository extends JpaRepository<ProposalBasicDetailsDto, Long> {
 
    ProposalBasicDetailsDto getProposalDetailsByProposalNumber(String proposalNumber);
    ProposalChannelDetailsDto getProposalChannelDetailsByProposalNumber(String proposalNumber);
    ProposalProductDetailsDto getProposalProductDetailsByProposalNumber(String proposalNumber);
    MphDetailsDto getMphDetailsByProposalNumber(String proposalNumber);
    CustomerDetailsDto getCustomerDetailsByProposalNumber(String proposalNumber);
    SubCustomerDetailsDto getSubCustomerDetailsByProposalNumber(String proposalNumber);
    CustomerTrustDetailsDto getCustomerTrustDetailsByProposalNumber(String proposalNumber);
    GroupCustomerBasicDetailsDto getGroupCustomerBasicDetailsByProposalNumber(String proposalNumber);
    ProposalNotesDto getProposalNotesByProposalNumber(String proposalNumber);
    BankAccountDetailsDto getBankAccountDetailsByProposalNumber(String proposalNumber);
    ContactDetailDto getContactDetailByProposalNumber(String proposalNumber);
    AddressDetailsDto getAddressDetailsByProposalNumber(String proposalNumber);
    AddressDetailsDto getSubCustomerAddressDetailsByProposalNumber(String proposalNumber);
    ContactDetailDto getSubCustomerContactDetailByProposalNumber(String proposalNumber);
    BankAccountDetailsDto getSubCustomerBankAccountDetailsByProposalNumber(String proposalNumber);
    BankAccountDetailsDto getTrustBankAccountDetailsByProposalNumber(String proposalNumber);
    ContactDetailDto getTrustContactDetailByProposalNumber(String proposalNumber);
    AddressDetailsDto getTrustAddressDetailsByProposalNumber(String proposalNumber);
}