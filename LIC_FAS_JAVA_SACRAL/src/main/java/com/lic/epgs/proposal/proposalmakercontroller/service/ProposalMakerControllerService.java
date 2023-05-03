package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalMakerControllerRepository;

@Service
public class ProposalMakerControllerService {

	@Autowired
	private ProposalMakerControllerRepository proposalMakerControllerRepository;

	public List<Proposal> findAll() {
		return proposalMakerControllerRepository.findAll();
	}

	public Optional<Proposal> findByProposalIdAndUserModified(Long proposalId, String userModified) {
		return proposalMakerControllerRepository.findByProposalIdAndUserModified(proposalId, userModified);
	}

	public Proposal save(Proposal proposal) {
		return proposalMakerControllerRepository.save(proposal);
	}

	public void markProposalInactive(Long proposalId) {
		proposalMakerControllerRepository.markProposalInactive(proposalId);
	}

	public void createCopyOfProposal(Long proposalId, String status) {
		proposalMakerControllerRepository.createCopyOfProposal(proposalId, status);
	}

	public void maintainDocuments(Long proposalId) {
		proposalMakerControllerRepository.maintainDocuments(proposalId);
	}

	public void sendResponse(Long proposalId, String status) {
		proposalMakerControllerRepository.sendResponse(proposalId, status);
	}

}