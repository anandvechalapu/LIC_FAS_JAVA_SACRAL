package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.model.ProductAndChannelDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetProductAndChannelDetailsProposalMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proposalmakercontroller/")
public class GetProductAndChannelDetailsProposalMakerController {
 
    @Autowired
    private GetProductAndChannelDetailsProposalMakerControllerService getProductAndChannelDetailsProposalMakerControllerService;
 
    /**
     * Retrieve the product and channel details associated with a given lead 
     * from the database and return them in an organized manner.
     * 
     * @param leadId the id of the lead to retrieve product and channel details for
     * @return the product and channel details associated with the lead
     * @throws Exception if an error or exception occurs during the retrieval process
     */
    @GetMapping("/{leadId}")
    public List<ProductAndChannelDetails> getProductAndChannelDetails(@PathVariable("leadId") String leadId) throws Exception {
        return getProductAndChannelDetailsProposalMakerControllerService.getProductAndChannelDetails(leadId);
    }
}