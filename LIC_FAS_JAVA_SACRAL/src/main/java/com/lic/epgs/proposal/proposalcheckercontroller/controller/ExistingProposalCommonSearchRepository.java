@Service
public class ExistingProposalCommonSearchRepository {

    @Autowired
    private ExistingProposalCommonSearchDao existingProposalCommonSearchDao;

    public List<ProposalBasicDetailsDto> searchExistingProposal(ProposalCommonSearchDto searchDto) {
        return existingProposalCommonSearchDao.searchExistingProposal(searchDto);
    }
}

package com.lic.epgs.proposal.proposalcheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalcheckercontroller.model.ProposalCommonSearchDto;
import com.lic.epgs.proposal.proposalcheckercontroller.service.ExistingProposalCommonSearchService;

@RestController
@RequestMapping("/proposal")
public class ProposalCheckerController {

    @Autowired
    private ExistingProposalCommonSearchService existingProposalCommonSearchService;

    @GetMapping("/existing/search")
    public List<ProposalBasicDetailsDto> searchExistingProposal(@RequestBody ProposalCommonSearchDto searchDto){
        return existingProposalCommonSearchService.searchExistingProposal(searchDto);
    }
}