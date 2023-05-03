package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Subcustomer;

/**
 * Repository interface for the Subcustomer entity.
 */
public interface SubcustomerRepository extends JpaRepository<Subcustomer, Long> {

    /**
     * Method to get a list of subcustomers associated to a customer ID.
     * @param customerId Customer ID.
     * @return List of subcustomers in alphabetical order.
     */
    @Query("SELECT sc FROM Subcustomer sc WHERE sc.customerId = ?1 ORDER BY sc.name ASC")
    List<Subcustomer> getSubcustomerNameList(Long customerId);

}