package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.trust.model.Trust;

public interface TrustRepository extends JpaRepository<Trust, Long> {

	/**
	 * Saves the trust details in the database and marks it as pending for the approver.
	 * 
	 * @param trust The trust object to save
	 * @return The trust object that was saved
	 */
	Trust saveAndSendForApproval(Trust trust);

	/**
	 * Updates the trust details in the database and marks it as pending for the approver.
	 * 
	 * @param trust The trust object to update
	 * @return The trust object that was updated
	 */
	Trust updateAndSendForApproval(Trust trust);

}