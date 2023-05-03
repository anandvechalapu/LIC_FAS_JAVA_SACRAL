package com.lic.epgs.proposal.proposalcheckercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalRejection;
import com.lic.epgs.proposal.proposalcheckercontroller.service.ProposalRejectionService;

@RestController
public class ProposalRejectionController {

	@Autowired
	private ProposalRejectionService proposalRejectionService;

	@PutMapping("/proposal/{proposalId}/reject")
	public ResponseEntity<ProposalRejection> rejectProposal(@PathVariable String proposalId, @RequestParam String rejectionRemark) {
		ProposalRejection proposalRejection = proposalRejectionService.findByProposalId(proposalId);
		if (proposalRejection != null) {
			proposalRejectionService.updateProposalStatusToRejectedAndWorkFlowStatusToRejected(proposalId);
			proposalRejectionService.updateRejectionRemarkForProposal(rejectionRemark, proposalId);
			proposalRejectionService.markProposalAsInactiveAndCreateNewVersionWithUpdatedStatus(proposalId);
			proposalRejectionService.updateProposalInAllRelatedTables(proposalId);
			proposalRejectionService.copyNotesAssociatedWithProposalToNewProposalVersion(proposalId);
			return new ResponseEntity<ProposalRejection>(proposalRejection, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}