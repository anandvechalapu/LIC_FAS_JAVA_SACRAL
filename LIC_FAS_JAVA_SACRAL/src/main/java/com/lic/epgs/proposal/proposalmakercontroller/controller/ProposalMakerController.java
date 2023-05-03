package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalMakerControllerService;

@RestController
@RequestMapping("/proposals")
public class ProposalMakerController {
	@Autowired
	private ProposalMakerControllerService proposalMakerControllerService;

	@GetMapping
	public List<Proposal> getAllProposals() {
		return proposalMakerControllerService.findAll();
	}

	@GetMapping("/{proposalId}/{userModified}")
	public Optional<Proposal> getProposalByIdAndUserModified(@PathVariable Long proposalId,
			@PathVariable String userModified) {
		return proposalMakerControllerService.findByProposalIdAndUserModified(proposalId, userModified);
	}

	@PostMapping
	public Proposal save(@RequestBody Proposal proposal) {
		return proposalMakerControllerService.save(proposal);
	}

	@PostMapping("/inactive/{proposalId}")
	public void markProposalInactive(@PathVariable Long proposalId) {
		proposalMakerControllerService.markProposalInactive(proposalId);
	}

	@PostMapping("/copy/{proposalId}/{status}")
	public void createCopyOfProposal(@PathVariable Long proposalId, @PathVariable String status) {
		proposalMakerControllerService.createCopyOfProposal(proposalId, status);
	}

	@PostMapping("/maintain/{proposalId}")
	public void maintainDocuments(@PathVariable Long proposalId) {
		proposalMakerControllerService.maintainDocuments(proposalId);
	}

	@PostMapping("/response/{proposalId}/{status}")
	public void sendResponse(@PathVariable Long proposalId, @PathVariable String status) {
		proposalMakerControllerService.sendResponse(proposalId, status);
	}

}