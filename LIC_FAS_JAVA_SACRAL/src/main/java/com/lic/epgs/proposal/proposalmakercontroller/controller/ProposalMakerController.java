package com.lic.epgs.proposal.proposalmakercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetProductSubVariantNameList;

@Repository
public interface GetProductSubVariantNameListRepository  extends JpaRepository<GetProductSubVariantNameList, Long>{
	
	@Query(value ="SELECT * FROM GetProductSubVariantNameList WHERE productVariantId=?1" , nativeQuery = true)
	public List<GetProductSubVariantNameList> getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(Long productVariantId);

}

package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetProductSubVariantNameList;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetProductSubVariantNameListService;

@RestController
@RequestMapping(value="/proposalmakercontroller")
public class ProposalMakerController {
	
	@Autowired
	private GetProductSubVariantNameListService getProductSubVariantNameListService;
	
	@GetMapping("/getProductSubVariantNameList/{productVariantId}")
	public List<GetProductSubVariantNameList> getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(@PathVariable Long productVariantId){
		return getProductSubVariantNameListService.getProductSubVariantNameList_PROPOSALMAKERCONTROLLER12(productVariantId);
	}

}