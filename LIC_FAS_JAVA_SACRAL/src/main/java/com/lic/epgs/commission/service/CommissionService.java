package com.lic.epgs.commission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

	@Autowired
	private CommissionRepository commissionRepository;

	public CommonCommissionDto loadCommissionDetails() throws Exception {
		return commissionRepository.loadCommissionDetails();
	}
}