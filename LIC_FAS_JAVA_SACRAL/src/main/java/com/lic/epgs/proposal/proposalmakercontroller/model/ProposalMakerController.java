ProposalNumber(String proposalNumber);

    // Proposal notes (ProposalNotesDto)
    @Query("SELECT p.proposalNotesDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ProposalNotesDto getProposalNotesByProposalNumber(String proposalNumber);

    // Bank account details (BankAccountDetailsDto)
    @Query("SELECT p.bankAccountDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    BankAccountDetailsDto getBankAccountDetailsByProposalNumber(String proposalNumber);

    // Contact details (ContactDetailDto)
    @Query("SELECT p.contactDetailDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    ContactDetailDto getContactDetailsByProposalNumber(String proposalNumber);

    // Address details (AddressDetailsDto)
    @Query("SELECT p.addressDetailsDto FROM ProposalMakerController p WHERE p.proposalNumber = ?1")
    AddressDetailsDto getAddressDetailsByProposalNumber(String proposalNumber);

}

package com.lic.epgs.proposal.proposalmakercontroller.model;

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

import javax.persistence.*;

@Entity
@Table(name = "proposal_maker_controller")
public class ProposalMakerController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "proposal_number")
    private String proposalNumber;

    @Column(name = "proposal_basic_details")
    private ProposalBasicDetailsDto proposalBasicDetailsDto;

    @Column(name = "proposal_channel_details")
    private ProposalChannelDetailsDto proposalChannelDetailsDto;

    @Column(name = "proposal_product_details")
    private ProposalProductDetailsDto proposalProductDetailsDto;

    @Column(name = "mph_details")
    private MphDetailsDto mphDetailsDto;

    @Column(name = "customer_details")
    private CustomerDetailsDto customerDetailsDto;

    @Column(name = "sub_customer_details")
    private SubCustomerDetailsDto subCustomerDetailsDto;

    @Column(name = "customer_trust_details")
    private CustomerTrustDetailsDto customerTrustDetailsDto;

    @Column(name = "group_customer_basic_details")
    private GroupCustomerBasicDetailsDto groupCustomerBasicDetailsDto;

    @Column(name = "proposal_notes")
    private ProposalNotesDto proposalNotesDto;

    @Column(name = "bank_account_details")
    private BankAccountDetailsDto bankAccountDetailsDto;

    @Column(name = "contact_details")
    private ContactDetailDto contactDetailDto;

    @Column