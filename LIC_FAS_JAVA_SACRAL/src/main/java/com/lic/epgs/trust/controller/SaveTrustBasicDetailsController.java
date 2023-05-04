package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustBasicDetails;
import com.lic.epgs.trust.service.SaveTrustBasicDetailsService;

@RestController
public class SaveTrustBasicDetailsController {

    @Autowired
    SaveTrustBasicDetailsService saveTrustBasicDetailsService;

    @GetMapping("/trust/{trustCode}")
    public ResponseEntity<TrustBasicDetails> getTrustBasicDetailsByTrustCode(@PathVariable String trustCode) {
        TrustBasicDetails trustBasicDetails = saveTrustBasicDetailsService.findByTrustCode(trustCode);
        if (trustBasicDetails != null) {
            return new ResponseEntity<TrustBasicDetails>(trustBasicDetails, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/trust")
    public ResponseEntity<TrustBasicDetails> saveTrustBasicDetails(@RequestBody TrustBasicDetails trustBasicDetails) {
        TrustBasicDetails savedTrustBasicDetails = saveTrustBasicDetailsService.save(trustBasicDetails);
        return new ResponseEntity<TrustBasicDetails>(savedTrustBasicDetails, HttpStatus.CREATED);
    }

    @PostMapping("/trust/{trustCode}/draft")
    public ResponseEntity<TrustBasicDetails> setTrustStatusAndWorkflowStatusAsDraft(@PathVariable String trustCode,
                                                                                   @RequestBody boolean isDraft) {
        saveTrustBasicDetailsService.setTrustStatusAndWorkflowStatusAsDraft(trustCode, isDraft);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/trust/{trustCode}/active")
    public ResponseEntity<TrustBasicDetails> setIsActiveFlagAsTrue(@PathVariable String trustCode,
                                                                  @RequestBody boolean isActive) {
        saveTrustBasicDetailsService.setIsActiveFlagAsTrue(trustCode, isActive);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/trust/{trustCode}/handle")
    public ResponseEntity<TrustBasicDetails> handleExceptionsAndErrorsGracefully(@PathVariable String trustCode) {
        saveTrustBasicDetailsService.handleExceptionsAndErrorsGracefully(trustCode);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}