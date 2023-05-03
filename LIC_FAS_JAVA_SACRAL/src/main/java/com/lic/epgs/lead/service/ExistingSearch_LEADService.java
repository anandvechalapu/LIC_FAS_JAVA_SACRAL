package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.model.Lead;
import com.lic.epgs.lead.repository.ExistingSearch_LEADRepository;

@Service
public class ExistingSearch_LEADService {

	@Autowired
	ExistingSearch_LEADRepository existingSearch_LEADRepository;

	public List<Lead> findLeadByUnitCodeAndCreatedBy(String unitCode, String createdBy) {
		return existingSearch_LEADRepository.findLeadByUnitCodeAndCreatedBy(unitCode, createdBy);
	}

	public List<Lead> findLeadByUnitCode(String unitCode) {
		return existingSearch_LEADRepository.findLeadByUnitCode(unitCode);
	}

}