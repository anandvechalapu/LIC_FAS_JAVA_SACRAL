package com.lic.epgs.proposal.proposalmakercontroller.repository;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalChannelDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.MphDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.CustomerDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.SubCustomerDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.CustomerTrustDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalNotesDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.BankAccountDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.ContactDetailDto;
import com.lic.epgs.proposal.proposalmakercontroller.dto.AddressDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProposalMakerControllerRepository extends JpaRepository<ProposalMakerController, Long> {

    // getProposalDetailsByProposalNumber endpoint
    @Query("SELECT p FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ProposalMakerController getProposalDetailsByProposalNumber(String proposalNumber);

    // Proposal basic details (ProposalBasicDetailsDto)
    @Query("SELECT p.proposalBasicDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ProposalBasicDetailsDto getProposalBasicDetailsByProposalNumber(String proposalNumber);

    // Proposal channel details (ProposalChannelDetailsDto)
    @Query("SELECT p.proposalChannelDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ProposalChannelDetailsDto getProposalChannelDetailsByProposalNumber(String proposalNumber);

    // Proposal product details (ProposalProductDetailsDto)
    @Query("SELECT p.proposalProductDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ProposalProductDetailsDto getProposalProductDetailsByProposalNumber(String proposalNumber);

    // MPH details (MphDetailsDto)
    @Query("SELECT p.mphDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    MphDetailsDto getMphDetailsByProposalNumber(String proposalNumber);

    // Customer details (CustomerDetailsDto)
    @Query("SELECT p.customerDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    CustomerDetailsDto getCustomerDetailsByProposalNumber(String proposalNumber);

    // Sub-customer details (SubCustomerDetailsDto)
    @Query("SELECT p.subCustomerDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    SubCustomerDetailsDto getSubCustomerDetailsByProposalNumber(String proposalNumber);

    // Trust details (CustomerTrustDetailsDto)
    @Query("SELECT p.customerTrustDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    CustomerTrustDetailsDto getCustomerTrustDetailsByProposalNumber(String proposalNumber);

    // Group customer basic details (GroupCustomerBasicDetailsDto)
    @Query("SELECT p.groupCustomerBasicDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    GroupCustomerBasicDetailsDto getGroupCustomerBasicDetailsBy