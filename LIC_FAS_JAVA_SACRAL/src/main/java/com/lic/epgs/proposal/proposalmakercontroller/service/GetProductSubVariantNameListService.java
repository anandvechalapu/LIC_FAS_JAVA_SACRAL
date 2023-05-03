package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetProductSubVariantNameList;
import com.lic.epgs.proposal.proposalmakercontroller.repository.GetProductSubVariantNameListRepository;

@Service
public class GetProductSubVariantNameListService {

	@Autowired
	private GetProductSubVariantNameListRepository getProductSubVariantNameListRepository;
	
	public List<GetProductSubVariantNameList> getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(Long productVariantId){
		return getProductSubVariantNameListRepository.getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(productVariantId);
	}
	
}