// TrustController.java

package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.service.TrustService;

@RestController
@RequestMapping("/trust")
public class TrustController {
    
    @Autowired
    private TrustService trustService;
    
    // Endpoint to retrieve trust details from the temporary table
    @GetMapping("/{trustId}")
    public TrustDetails findByTrustId(@PathVariable Long trustId) {
        return trustService.findByTrustId(trustId);
    }
    
    // Endpoint to retrieve bank account details from the temporary table associated with the trustId
    @GetMapping("/{trustId}/account/{bankAccountId}")
    public TrustDetails findByTrustIdAndBankAccountId(@PathVariable Long trustId, @PathVariable Long bankAccountId) {
        return trustService.findByTrustIdAndBankAccountId(trustId, bankAccountId);
    }
    
    // Endpoint to retrieve contact details from the temporary table associated with the trustId
    @GetMapping("/{trustId}/contact/{contactPersonId}")
    public TrustDetails findByTrustIdAndContactPersonId(@PathVariable Long trustId, @PathVariable Long contactPersonId) {
        return trustService.findByTrustIdAndContactPersonId(trustId, contactPersonId);
    }
    
    // Endpoint to retrieve address details from the temporary table associated with the trustId
    @GetMapping("/{trustId}/address/{addressId}")
    public TrustDetails findByTrustIdAndAddressId(@PathVariable Long trustId, @PathVariable Long addressId) {
        return trustService.findByTrustIdAndAddressId(trustId, addressId);
    }
    
    // Endpoint to save the newly created trust details entity in the temporary table
    @PutMapping("/save")
    public TrustDetails save(@RequestBody TrustDetails trustDetails) {
        return trustService.save(trustDetails);
    }
    
    // Endpoint to update the trust details entity in the temporary table
    @PutMapping("/update/{trustId}/{role}")
    public TrustDetails updateTrustDetails(@PathVariable Long trustId, @PathVariable String role) {
        return trustService.updateTrustDetails(trustId, role);
    }
}