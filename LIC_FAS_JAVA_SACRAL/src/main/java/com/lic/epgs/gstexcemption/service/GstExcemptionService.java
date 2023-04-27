package com.lic.epgs.gstexcemption.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;
import com.lic.epgs.gstexcemption.model.GstExcemptionRepository;

@Service
public class GstExcemptionService {

	private final GstExcemptionRepository gstExcemptionRepository;

	public GstExcemptionService(GstExcemptionRepository gstExcemptionRepository) {
		this.gstExcemptionRepository = gstExcemptionRepository;
	}

	@Transactional
	public GstPolicyNumberDto getGstByProposalNo(String proposalNumber) {
		return gstExcemptionRepository.getGstByProposalNo(proposalNumber);
	}
}