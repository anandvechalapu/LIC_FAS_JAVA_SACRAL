package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductAndChannelDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductAndChannelDetailsService;

@RestController
@RequestMapping("/prodchannel")
public class ProductAndChannelDetailsController {
	
	@Autowired
	private ProductAndChannelDetailsService productAndChannelDetailsService;
	
	@GetMapping("/{leadId}")
	public ProductAndChannelDetails getProductAndChannelDetailsByLeadId(@PathVariable Long leadId) {
		return productAndChannelDetailsService.getProductAndChannelDetailsByLeadId(leadId);
	}
	
	@GetMapping("/list/{leadIds}")
	public List<ProductAndChannelDetails> getProductAndChannelDetailsByLeadIds(@PathVariable List<Long> leadIds) {
		return productAndChannelDetailsService.getProductAndChannelDetailsByLeadIds(leadIds);
	}
	
	@GetMapping("/all/{leadId}")
	public List<ProductAndChannelDetails> findAllByLeadId(@PathVariable Long leadId) {
		return productAndChannelDetailsService.findAllByLeadId(leadId);
	}

}