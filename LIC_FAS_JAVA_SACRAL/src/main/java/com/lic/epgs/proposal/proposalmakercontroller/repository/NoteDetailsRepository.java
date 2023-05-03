package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.NoteDetails;

@Repository
public interface NoteDetailsRepository extends JpaRepository<NoteDetails, Long> {
	
	NoteDetails getNoteDetailsList_PROPOSALMAKERCONTROLLER7(Long id);

}