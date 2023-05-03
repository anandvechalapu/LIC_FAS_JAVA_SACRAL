package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Subcustomer;
import com.lic.epgs.proposal.proposalmakercontroller.repository.SubcustomerRepository;

@Service
public class SubcustomerService {

    private SubcustomerRepository subcustomerRepository;

    public SubcustomerService(SubcustomerRepository subcustomerRepository) {
        this.subcustomerRepository = subcustomerRepository;
    }

    /**
     * Method to get a list of subcustomers associated to a customer ID.
     * @param customerId Customer ID.
     * @return List of subcustomers in alphabetical order.
     */
    public List<Subcustomer> getSubcustomerNameList(Long customerId) {
        return subcustomerRepository.getSubcustomerNameList(customerId);
    }
}