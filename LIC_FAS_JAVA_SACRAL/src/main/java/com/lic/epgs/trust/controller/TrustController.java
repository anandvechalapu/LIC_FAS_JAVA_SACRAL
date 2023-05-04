package com.lic.epgs.trust.controller;

import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.ContactDetailEntity;
import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.service.TrustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trust")
public class TrustController {

    @Autowired
    private TrustService trustService;

    @PostMapping("/details")
    public TrustDetails getTrustDetails(@RequestBody TrustDetails trustDetails) {
        trustDetails.setTrustDetails(trustService.getTrustDetailsTemp(trustDetails.getTrustId()));
        trustDetails.setBankAccountDetails(trustService.getBankAccountDetailsTemp(trustDetails.getTrustId()));
        trustDetails.setContactDetails(trustService.getContactDetailsTemp(trustDetails.getTrustId()));
        return trustDetails;
    }

    @PutMapping("/details")
    public TrustDetails updateTrustDetails(@RequestBody TrustDetails trustDetails) {
        trustDetails.setTrustDetails(trustService.saveTrustDetailsTemp((TrustDetailsDto) trustDetails.getTrustDetails()));
        trustDetails.setBankAccountDetails(trustService.saveBankAccountDetailsTemp(trustDetails.getBankAccountDetails()));
        trustDetails.setContactDetails(trustService.saveContactDetailsTemp(trustDetails.getContactDetails()));
        return trustDetails;
    }
}