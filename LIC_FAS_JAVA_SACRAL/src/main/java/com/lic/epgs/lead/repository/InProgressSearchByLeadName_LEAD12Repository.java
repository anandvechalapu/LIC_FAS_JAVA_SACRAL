package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InProgressSearchByLeadName_LEAD12Repository extends JpaRepository<Lead, Long> {
    
    Lead findByNameAndCreatedBy(String name, String createdBy);
    
    Lead findByName(String name);
    
    Lead findByCreatedBy(String createdBy);
    
    Lead findByChannel(String channel);
    
    void deleteByName(String name);
    
    void deleteByCreatedBy(String createdBy);
    
    void deleteByChannel(String channel);
}