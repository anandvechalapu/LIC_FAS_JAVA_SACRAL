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

import com.lic.epgs.proposal.proposalmakercontroller.model.GetLeadSearchProposalMakerController;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetLeadSearchProposalMakerControllerService;

@RestController
@RequestMapping("/api/getLeadSearchProposalMakerController")
public class GetLeadSearchProposalMakerControllerController {

	@Autowired
	private GetLeadSearchProposalMakerControllerService getLeadSearchProposalMakerControllerService;

	@PostMapping
	public GetLeadSearchProposalMakerController create(@RequestBody GetLeadSearchProposalMakerController controller) {
		return getLeadSearchProposalMakerControllerService.save(controller);
	}

	@GetMapping
	public List<GetLeadSearchProposalMakerController> findAll() {
		return getLeadSearchProposalMakerControllerService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<GetLeadSearchProposalMakerController> findById(@PathVariable Long id) {
		return getLeadSearchProposalMakerControllerService.findById(id);
	}

	@GetMapping("/businessLogic/{businessLogic}")
	public GetLeadSearchProposalMakerController findByBusinessLogic(@PathVariable String businessLogic) {
		return getLeadSearchProposalMakerControllerService.findByBusinessLogic(businessLogic);
	}

	@GetMapping("/output/{output}")
	public GetLeadSearchProposalMakerController findByOutput(@PathVariable String output) {
		return getLeadSearchProposalMakerControllerService.findByOutput(output);
	}

	@GetMapping("/testVerification/{testVerification}")
	public GetLeadSearchProposalMakerController findByTestVerification(@PathVariable String testVerification) {
		return getLeadSearchProposalMakerControllerService.findByTestVerification(testVerification);
	}

	@GetMapping("/documentation/{documentation}")
	public GetLeadSearchProposalMakerController findByDocumentation(@PathVariable String documentation) {
		return getLeadSearchProposalMakerControllerService.findByDocumentation(documentation);
	}

	@GetMapping("/deployment/{deployment}")
	public GetLeadSearchProposalMakerController findByDeployment(@PathVariable String deployment) {
		return getLeadSearchProposalMakerControllerService.findByDeployment(deployment);
	}

	@GetMapping("/monitoring/{monitoring}")
	public GetLeadSearchProposalMakerController findByMonitoring(@PathVariable String monitoring) {
		return getLeadSearchProposalMakerControllerService.findByMonitoring(monitoring);
	}

}