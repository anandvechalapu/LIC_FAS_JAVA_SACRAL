package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductDetailsService;


@RestController
@RequestMapping("/proposalmakercontroller")
public class ProductDetailsController {

	@Autowired
	private ProductDetailsService productDetailsService;
	
	@GetMapping("/productNameList_PROPOSALMAKERCONTROLLER11")
	public List<ProductDetailsDto> getProductNameList_PROPOSALMAKERCONTROLLER11(){
		return productDetailsService.getProductNameList_PROPOSALMAKERCONTROLLER11();
	}
}