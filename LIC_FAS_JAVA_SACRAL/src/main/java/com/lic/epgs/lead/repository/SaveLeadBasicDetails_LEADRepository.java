package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.lead.model.SaveLeadBasicDetails_LEAD;

@Repository
public interface SaveLeadBasicDetails_LEADRepository extends JpaRepository<SaveLeadBasicDetails_LEAD, Long> {

    /**
     * This method is used to save a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The saved leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD save(SaveLeadBasicDetails_LEAD leadBasicDetails);

    /**
     * This method is used to find a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be retrieved.
     * @return The Lead Basic Details record containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD findByLeadId(Long leadId);

    /**
     * This method is used to update a Lead Basic Details record.
     *
     * @param leadBasicDetails The leadBasicDetails object containing the Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code.
     * @return The updated leadBasicDetails object containing the Lead ID, Lead Name, LMS Lead No, Lead Contact No, PAN, Email Id, Lead Status, Lead Sub Status, Workflow Status, Created By, Created On, Lead Expiry Date, Customer ID, Customer Code, Unit Code and Lead Number.
     */
    public SaveLeadBasicDetails_LEAD update(SaveLeadBasicDetails_LEAD leadBasicDetails);

    /**
     * This method is used to delete a Lead Basic Details record by its Lead ID.
     *
     * @param leadId The Lead ID of the Lead Basic Details record to be deleted.
     */
    public void deleteByLeadId(Long leadId);
}