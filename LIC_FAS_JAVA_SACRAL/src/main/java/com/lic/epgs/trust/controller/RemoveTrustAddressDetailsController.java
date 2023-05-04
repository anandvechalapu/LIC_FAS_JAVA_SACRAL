package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustAddressDetails;
import com.lic.epgs.trust.service.RemoveTrustAddressDetailsService;

@RestController
@RequestMapping("/trust")
public class RemoveTrustAddressDetailsController {

    @Autowired
    private RemoveTrustAddressDetailsService removeTrustAddressDetailsService;

    @PostMapping("/removeAddress")
    public int removeAddress(@RequestParam("trustId") Long trustId, @RequestParam("addressId") Long addressId, 
    @RequestParam("role") String role, @RequestParam("modifiedBy") String modifiedBy, @RequestParam("modifiedOn") String modifiedOn) {
        return removeTrustAddressDetailsService.setInactiveByTrustIdAndAddressIdAndRole(trustId, addressId, role, modifiedBy, modifiedOn);
    }

}