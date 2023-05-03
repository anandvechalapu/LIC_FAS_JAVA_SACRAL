package com.lic.epgs.lead.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.SaveLeadBasicDetails_LEAD;
import com.lic.epgs.lead.repository.SaveLeadBasicDetails_LEADRepository;

@Service
public class SaveLeadBasicDetails_LEADService {
	
	@Autowired
	private SaveLeadBasicDetails_LEADRepository saveLeadBasicDetails_LEADRepository;
	
	/**
     * This method is used to save a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The saved leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD saveLeadBasicDetails_LEAD(SaveLeadBasicDetails_LEAD leadBasicDetails) {
        return saveLeadBasicDetails_LEADRepository.save(leadBasicDetails);
    }

    /**
     * This method is used to find a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be retrieved.
     * @return The Lead Basic Details record containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD getLeadBasicDetails_LEADById(Long leadId) {
        return saveLeadBasicDetails_LEADRepository.findByLeadId(leadId);
    }

    /**
     * This method is used to update a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The updated leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD updateLeadBasicDetails_LEAD(SaveLeadBasicDetails_LEAD leadBasicDetails) {
        return saveLeadBasicDetails_LEADRepository.update(leadBasicDetails);
    }

    /**
     * This method is used to delete a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be deleted.
     */
    public void deleteLeadBasicDetails_LEADById(Long leadId) {
        saveLeadBasicDetails_LEADRepository.deleteByLeadId(leadId);
    }
}