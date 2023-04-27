package com.lic.epgs.gstexcemption.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.GstAllTempDetailsByGstId11_Gstexcemption8;
import com.lic.epgs.gstexcemption.repository.GstAllTempDetailsByGstId11_Gstexcemption8Repository;

@Service
public class GstAllTempDetailsByGstId11_Gstexcemption8Service {

	@Autowired
	private GstAllTempDetailsByGstId11_Gstexcemption8Repository gstAllTempDetailsByGstId11_Gstexcemption8Repository;
	
	public Optional<GstAllTempDetailsByGstId11_Gstexcemption8> getGstExemptionId(Long gstExemptionId) {
		return gstAllTempDetailsByGstId11_Gstexcemption8Repository.findByGstExemptionId(gstExemptionId);
	}

}