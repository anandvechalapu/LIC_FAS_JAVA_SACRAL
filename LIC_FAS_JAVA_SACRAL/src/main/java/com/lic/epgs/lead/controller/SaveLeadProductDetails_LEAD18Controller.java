package com.lic.epgs.lead.controller;

import com.lic.epgs.lead.dto.LeadProductDetailsDto;
import com.lic.epgs.lead.entity.LeadProductDetailsTempEntity;
import com.lic.epgs.lead.service.SaveLeadProductDetails_LEAD18Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveLeadProductDetails_LEAD18Controller {

    @Autowired
    private SaveLeadProductDetails_LEAD18Service saveLeadProductDetails_LEAD18Service;

    @PostMapping("/saveLeadProductDetails")
    public LeadProductDetailsTempEntity saveLeadProductDetails(@RequestBody LeadProductDetailsDto leadProductDetailsDto) {
        return  saveLeadProductDetails_LEAD18Service.save(leadProductDetailsDto);
    }
}