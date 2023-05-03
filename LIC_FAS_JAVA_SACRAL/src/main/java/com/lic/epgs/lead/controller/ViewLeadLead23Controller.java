package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.CommonLeadDto;
import com.lic.epgs.lead.model.ProductDetailsDto;
import com.lic.epgs.lead.model.ActivityDetailsDto;
import com.lic.epgs.lead.model.ChannelDetailsDto;
import com.lic.epgs.lead.service.ViewLeadLead23Service;

@RestController
@RequestMapping("/view-lead-lead-23")
public class ViewLeadLead23Controller {

    @Autowired
    private ViewLeadLead23Service viewLeadLead23Service;
    
    @GetMapping("/lead-basic-details")
    public CommonLeadDto getLeadBasicDetails() {
        return viewLeadLead23Service.getLeadBasicDetails();
    }
    
    @GetMapping("/product-details")
    public List<ProductDetailsDto> getProductDetails() {
        return viewLeadLead23Service.getProductDetails();
    }
    
    @GetMapping("/channel-details")
    public List<ChannelDetailsDto> getChannelDetails() {
        return viewLeadLead23Service.getChannelDetails();
    }
    
    @GetMapping("/activity-details")
    public List<ActivityDetailsDto> getActivityDetails() {
        return viewLeadLead23Service.getActivityDetails();
    }
    
    @GetMapping("/update-rejection-remarks")
    public boolean updateRejectionRemarks(@RequestParam String remarks) {
        return viewLeadLead23Service.updateRejectionRemarks(remarks);
    }
}