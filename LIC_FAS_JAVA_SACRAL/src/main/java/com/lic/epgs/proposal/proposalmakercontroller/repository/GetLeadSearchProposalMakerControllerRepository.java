package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GetLeadSearchProposalMakerControllerRepository extends JpaRepository<GetLeadSearchProposalMakerController, Long> {
    GetLeadSearchProposalMakerController findByBusinessLogic(String businessLogic);
    GetLeadSearchProposalMakerController findByOutput(String output);
    GetLeadSearchProposalMakerController findByTestVerification(String testVerification);
    GetLeadSearchProposalMakerController findByDocumentation(String documentation);
    GetLeadSearchProposalMakerController findByDeployment(String deployment);
    GetLeadSearchProposalMakerController findByMonitoring(String monitoring);
}