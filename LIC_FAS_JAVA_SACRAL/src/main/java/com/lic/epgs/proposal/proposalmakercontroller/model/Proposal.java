package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="proposal")
public class Proposal {

    @Id
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private SubCustomer subCustomer;

    @ManyToOne
    private Trust trust;

    @ManyToOne
    private GroupCustomer groupCustomer;

    @ManyToOne
    private Lead lead;

    @ManyToOne
    private ProposalBasic proposalBasic;

    @ManyToOne
    private ProposalChannel proposalChannel;

    @ManyToOne
    private ProposalProduct proposalProduct;

    @ManyToOne
    private BankAccount bankAccount;

    @ManyToOne
    private ContactPerson contactPerson;

    @ManyToOne
    private Address address;

    // getters and setters

}