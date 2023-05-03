package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.NoteDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.NoteDetailsRepository;

@Service
public class NoteDetailsService {
	
	@Autowired
	private NoteDetailsRepository noteDetailsRepository;
	
	public NoteDetails getNoteDetailsList_PROPOSALMAKERCONTROLLER7(Long id) {
		return noteDetailsRepository.getNoteDetailsList_PROPOSALMAKERCONTROLLER7(id);
	} 
	
	public List<NoteDetails> findAll() {
		return noteDetailsRepository.findAll();
	}
	
	public NoteDetails save(NoteDetails noteDetails) {
		return noteDetailsRepository.save(noteDetails);
	}

}