package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {
	
	@Autowired
	private CommissionService commissionService;
	
	@GetMapping("/load-commission-details")
	public CommonCommissionDto loadCommissionDetails() throws Exception {
		return commissionService.loadCommissionDetails();
	}

}