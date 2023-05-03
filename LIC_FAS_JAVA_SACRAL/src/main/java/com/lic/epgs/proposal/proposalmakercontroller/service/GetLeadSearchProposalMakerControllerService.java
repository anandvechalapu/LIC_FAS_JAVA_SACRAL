package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetLeadSearchProposalMakerController;
import com.lic.epgs.proposal.proposalmakercontroller.repository.GetLeadSearchProposalMakerControllerRepository;

@Service
public class GetLeadSearchProposalMakerControllerService {

	@Autowired
	private GetLeadSearchProposalMakerControllerRepository getLeadSearchProposalMakerControllerRepository;

	public GetLeadSearchProposalMakerController save(GetLeadSearchProposalMakerController controller) {
		return getLeadSearchProposalMakerControllerRepository.save(controller);
	}

	public List<GetLeadSearchProposalMakerController> findAll() {
		return getLeadSearchProposalMakerControllerRepository.findAll();
	}

	public Optional<GetLeadSearchProposalMakerController> findById(Long id) {
		return getLeadSearchProposalMakerControllerRepository.findById(id);
	}

	public GetLeadSearchProposalMakerController findByBusinessLogic(String businessLogic) {
		return getLeadSearchProposalMakerControllerRepository.findByBusinessLogic(businessLogic);
	}

	public GetLeadSearchProposalMakerController findByOutput(String output) {
		return getLeadSearchProposalMakerControllerRepository.findByOutput(output);
	}

	public GetLeadSearchProposalMakerController findByTestVerification(String testVerification) {
		return getLeadSearchProposalMakerControllerRepository.findByTestVerification(testVerification);
	}

	public GetLeadSearchProposalMakerController findByDocumentation(String documentation) {
		return getLeadSearchProposalMakerControllerRepository.findByDocumentation(documentation);
	}

	public GetLeadSearchProposalMakerController findByDeployment(String deployment) {
		return getLeadSearchProposalMakerControllerRepository.findByDeployment(deployment);
	}

	public GetLeadSearchProposalMakerController findByMonitoring(String monitoring) {
		return getLeadSearchProposalMakerControllerRepository.findByMonitoring(monitoring);
	}

	public void delete(GetLeadSearchProposalMakerController controller) {
		getLeadSearchProposalMakerControllerRepository.delete(controller);
	}
}