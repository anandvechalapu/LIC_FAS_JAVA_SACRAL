package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductAndChannelDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductAndChannelDetailsRepository;

@Service
public class ProductAndChannelDetailsService {

	@Autowired
	private ProductAndChannelDetailsRepository productAndChannelDetailsRepository;
	
	public ProductAndChannelDetails getProductAndChannelDetailsByLeadId(Long leadId) {
		return productAndChannelDetailsRepository.getProductAndChannelDetailsByLeadId(leadId);
	}
	
	public List<ProductAndChannelDetails> getProductAndChannelDetailsByLeadIds(List<Long> leadIds) {
		return productAndChannelDetailsRepository.getProductAndChannelDetailsByLeadIds(leadIds);
	}
	
	public List<ProductAndChannelDetails> findAllByLeadId(Long leadId) {
		return productAndChannelDetailsRepository.findAllByLeadId(leadId);
	}
}