package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.repository.GetProductAndChannelDetailsProposalMakerControllerRepository;
import com.lic.epgs.model.ProductAndChannelDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductAndChannelDetailsProposalMakerControllerServiceImpl implements GetProductAndChannelDetailsProposalMakerControllerService {
 
    @Autowired
    private GetProductAndChannelDetailsProposalMakerControllerRepository getProductAndChannelDetailsProposalMakerControllerRepository;
 
    /**
     * Retrieve the product and channel details associated with a given lead 
     * from the database and return them in an organized manner.
     * 
     * @param leadId the id of the lead to retrieve product and channel details for
     * @return the product and channel details associated with the lead
     * @throws Exception if an error or exception occurs during the retrieval process
     */
    @Override
    public List<ProductAndChannelDetails> getProductAndChannelDetails(String leadId) throws Exception {
        return getProductAndChannelDetailsProposalMakerControllerRepository.getProductAndChannelDetails(leadId);
    }
 
}