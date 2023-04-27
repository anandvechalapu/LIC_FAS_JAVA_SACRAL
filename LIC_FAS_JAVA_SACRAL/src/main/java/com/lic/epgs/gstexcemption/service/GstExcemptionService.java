package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.GstExcemption;
import com.lic.epgs.gstexcemption.repository.GstExcemptionRepository;

@Service
public class GstExcemptionService {
	
	@Autowired
	GstExcemptionRepository gstExcemptionRepository;
	
	public List<GstExcemption> findByLoginUserAndUnitCode(String loginUser, String unitCode) {
		return gstExcemptionRepository.findByLoginUserAndUnitCode(loginUser, unitCode);
	}
	
	public List<GstExcemption> findByGstExcemptionStatusAndUnitCode(String gstExcemptionStatus, String unitCode) {
		return gstExcemptionRepository.findByGstExcemptionStatusAndUnitCode(gstExcemptionStatus, unitCode);
	}
	
	public List<GstExcemption> findByUnitCode(String unitCode) {
		return gstExcemptionRepository.findByUnitCode(unitCode);
	}

}