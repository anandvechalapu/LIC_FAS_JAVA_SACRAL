package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.SaveLeadBasicDetails_LEAD;
import com.lic.epgs.lead.service.SaveLeadBasicDetails_LEADService;

@RestController
public class SaveLeadBasicDetails_LEADController {
	
	@Autowired
	private SaveLeadBasicDetails_LEADService saveLeadBasicDetails_LEADService;
	
	/**
     * This controller method is used to save a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The saved leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    @PostMapping("/saveLeadBasicDetails_LEAD")
    public SaveLeadBasicDetails_LEAD saveLeadBasicDetails_LEAD(@RequestBody SaveLeadBasicDetails_LEAD leadBasicDetails) {
        return saveLeadBasicDetails_LEADService.saveLeadBasicDetails_LEAD(leadBasicDetails);
    }

    /**
     * This controller method is used to find a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be retrieved.
     * @return The Lead Basic Details record containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    @GetMapping("/getLeadBasicDetails_LEADById")
    public SaveLeadBasicDetails_LEAD getLeadBasicDetails_LEADById(@RequestParam Long leadId) {
        return saveLeadBasicDetails_LEADService.getLeadBasicDetails_LEADById(leadId);
    }

    /**
     * This controller method is used to update a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The updated leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    @PutMapping("/updateLeadBasicDetails_LEAD")
    public SaveLeadBasicDetails_LEAD updateLeadBasicDetails_LEAD(@RequestBody SaveLeadBasicDetails_LEAD leadBasicDetails) {
        return saveLeadBasicDetails_LEADService.updateLeadBasicDetails_LEAD(leadBasicDetails);
    }

    /**
     * This controller method is used to delete a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be deleted.
     */
    @DeleteMapping("/deleteLeadBasicDetails_LEADById")
    public void deleteLeadBasicDetails_LEADById(@RequestParam Long leadId) {
        saveLeadBasicDetails_LEADService.deleteLeadBasicDetails_LEADById(leadId);
    }

}