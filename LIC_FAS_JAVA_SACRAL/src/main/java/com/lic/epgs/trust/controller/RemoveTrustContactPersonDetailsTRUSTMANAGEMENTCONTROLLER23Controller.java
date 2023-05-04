package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.service.RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service;

@RestController
@RequestMapping("/trust")
public class RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Controller {
 
    @Autowired
    private RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service;
    
    @DeleteMapping("/contactPerson/{trustId}/{contactPersonId}/{role}")
    public int removeTrustContactPersonDetails(@PathVariable String trustId, @PathVariable String contactPersonId, @PathVariable String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.removeTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    @GetMapping("/contactPerson/{trustId}/{contactPersonId}/{role}")
    public Optional<TrustDetails> findTrustContactPersonDetails(@PathVariable String trustId, @PathVariable String contactPersonId, @PathVariable String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.findTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    @PutMapping("/contactPerson/{trustId}/{contactPersonId}/{role}")
    public int updateTrustContactPersonDetails(@PathVariable String trustId, @PathVariable String contactPersonId, @PathVariable String role, @RequestBody TrustDetails trustDetails) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.updateTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    @GetMapping("/contactPerson/trust/{trustId}")
    public List<TrustDetails> findTrustContactPersonsByTrustId(@PathVariable String trustId) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.findTrustContactPersonsByTrustId(trustId);
    }
    
    @GetMapping("/contactPerson/trust/{trustId}/{role}")
    public List<TrustDetails> findTrustContactPersonsByTrustIdAndRole(@PathVariable String trustId, @PathVariable String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.findTrustContactPersonsByTrustIdAndRole(trustId, role);
    }
    
    @GetMapping("/contactPerson/contactPerson/{contactPersonId}")
    public List<TrustDetails> findTrustContactPersonsByContactPersonId(@PathVariable String contactPersonId) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.findTrustContactPersonsByContactPersonId(contactPersonId);
    }
    
    @GetMapping("/contactPerson/contactPerson/{contactPersonId}/{role}")
    public List<TrustDetails> findTrustContactPersonsByContactPersonIdAndRole(@PathVariable String contactPersonId, @PathVariable String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service.findTrustContactPersonsByContactPersonIdAndRole(contactPersonId, role);
    }
}