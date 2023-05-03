package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductDetailsRepository;

@Service
public class ProductDetailsService {
	
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	public List<ProductDetailsDto> getProductNameList_PROPOSALMAKERCONTROLLER11(){
		return Arrays.asList(productDetailsRepository.getProductNameList_PROPOSALMAKERCONTROLLER11());
	}
}