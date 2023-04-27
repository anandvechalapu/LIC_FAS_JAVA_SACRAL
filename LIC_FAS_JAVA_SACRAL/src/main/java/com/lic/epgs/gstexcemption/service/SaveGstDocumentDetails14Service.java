package com.lic.epgs.gstexcemption.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.DocumentDetailsDto;
import com.lic.epgs.gstexcemption.repository.SaveGstDocumentDetails14Repository;

@Service
public class SaveGstDocumentDetails14Service {

	@Autowired
	private SaveGstDocumentDetails14Repository saveGstDocumentDetails14Repository;

	public DocumentDetailsDto findByGstExemptionId(Long gstExemptionId) {
		return saveGstDocumentDetails14Repository.findByGstExemptionId(gstExemptionId);
	}

	public DocumentDetailsDto save(DocumentDetailsDto documentDetailsDto) {
		return saveGstDocumentDetails14Repository.save(documentDetailsDto);
	}

	public void deleteByGstExemptionId(Long gstExemptionId) {
		saveGstDocumentDetails14Repository.deleteByGstExemptionId(gstExemptionId);
	}

}