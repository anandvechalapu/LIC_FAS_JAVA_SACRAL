package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.repository.GSTExcemptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GSTExcemptionService {
	
	@Autowired
	GSTExcemptionRepository gstExcemptionRepository;
	
	public List<GstExcemptionDto> searchforInProgress(String loginUser, String unitCode, String gstNo, String proposalNo) {
		return gstExcemptionRepository.searchforInProgress(loginUser, unitCode, gstNo, proposalNo);
	}
}