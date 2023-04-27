package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.ExistingSearch8GstExcemption;
import com.lic.epgs.gstexcemption.repository.ExistingSearch8GstExcemptionRepository;

@Service
public class ExistingSearch8GstExcemptionService {
	
	@Autowired
	private ExistingSearch8GstExcemptionRepository existingSearch8GstExcemptionRepository;
	
	public ExistingSearch8GstExcemption findByUnitCode(String unitCode) {
		return existingSearch8GstExcemptionRepository.findByUnitCode(unitCode);
	}
	
	public List<ExistingSearch8GstExcemption> findAll() {
		return existingSearch8GstExcemptionRepository.findAll();
	}
	
	public ExistingSearch8GstExcemption save(ExistingSearch8GstExcemption existingSearch8GstExcemption) {
		return existingSearch8GstExcemptionRepository.save(existingSearch8GstExcemption);
	}
	
	public void delete(ExistingSearch8GstExcemption existingSearch8GstExcemption) {
		existingSearch8GstExcemptionRepository.delete(existingSearch8GstExcemption);
	}
	
}