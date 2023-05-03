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
public interface ProposalMakerControllerRepository extends JpaRepository<ProposalMakerController, Long> {
	
	ProposalBasicDetailsDto getProposalDetailsByProposalNumber(String proposalNumber); 
	
	ProposalChannelDetailsDto getProposalChannelDetailsByProposalNumber(String proposalNumber);
	
	ProposalProductDetailsDto getProposalProductDetailsByProposalNumber(String proposalNumber);
	
	MphDetailsDto getMphDetailsByProposalNumber(String proposalNumber);
	
	CustomerDetailsDto getCustomerDetailsByProposalNumber(String proposalNumber);
	
	SubCustomerDetailsDto getSubCustomerDetailsByProposalNumber(String proposalNumber);
	
	CustomerTrustDetailsDto getCustomerTrustDetailsByProposalNumber(String proposalNumber);
	
	GroupCustomerBasicDetailsDto getGroupCustomerBasicDetailsByProposalNumber(String proposalNumber);
	
	ProposalNotesDto getProposalNotesByProposalNumber(String proposalNumber);
	
	BankAccountDetailsDto getCustomerBankAccountDetailsByProposalNumber(String proposalNumber);
	
	ContactDetailDto getCustomerContactPersonDetailsByProposalNumber(String proposalNumber);
	
	AddressDetailsDto getCustomerAddressDetailsByProposalNumber(String proposalNumber);
	
	AddressDetailsDto getSubCustomerAddressDetailsByProposalNumber(String proposalNumber);
	
	ContactDetailDto getSubCustomerContactPersonDetailsByProposalNumber(String proposalNumber);
	
	BankAccountDetailsDto getSubCustomerBankAccountDetailsByProposalNumber(String proposalNumber);
	
	BankAccountDetailsDto getTrustBankAccountDetailsByProposalNumber(String proposalNumber);
	
	ContactDetailDto getTrustContactPersonDetailsByProposalNumber(String proposalNumber);
	
	AddressDetailsDto getTrustAddressDetailsByProposalNumber(String proposalNumber);
}