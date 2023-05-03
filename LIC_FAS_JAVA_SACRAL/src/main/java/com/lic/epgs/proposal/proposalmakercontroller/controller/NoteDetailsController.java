package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.NoteDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.NoteDetailsService;

@RestController
@RequestMapping("/proposalmakercontroller7")
public class NoteDetailsController {
	
	@Autowired
	private NoteDetailsService noteDetailsService;
	
	@GetMapping("/{id}")
	public NoteDetails getNoteDetailsList_PROPOSALMAKERCONTROLLER7(@PathVariable Long id) {
		return noteDetailsService.getNoteDetailsList_PROPOSALMAKERCONTROLLER7(id);
	} 
	
	@GetMapping
	public List<NoteDetails> findAll(){
		return noteDetailsService.findAll();
	}
	
	@PostMapping
	public NoteDetails save(@RequestBody NoteDetails noteDetails) {
		return noteDetailsService.save(noteDetails);
	}

}