package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lead {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long leadId;
 
    private Long productId;
 
    private Long channelId;
 
    //Getters and setters
 
    public Long getLeadId() {
        return leadId;
    }
 
    public void setLeadId(Long leadId) {
        this.leadId = leadId;
    }
 
    public Long getProductId() {
        return productId;
    }
 
    public void setProductId(Long productId) {
        this.productId = productId;
    }
 
    public Long getChannelId() {
        return channelId;
    }
 
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
 
}