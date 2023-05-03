package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.lead.model.ApprovedLead2;

@Repository
public interface ApprovedLead2Service {

	public ApprovedLead2 findByLeadId(Long leadId);
    
    public List<ApprovedLead2> findAllByModifiedBy(String modifiedBy);
    
    public List<ApprovedLead2> findAllByLeadStatus(String leadStatus);
    
    public List<ApprovedLead2> findAllByLeadSubStatus(String leadSubStatus);
    
    public List<ApprovedLead2> findAllByWorkflowStatus(String workflowStatus);
    
    public void updateApprovedLead2(Long leadId, String leadStatus, String leadSubStatus, String workflowStatus);

}