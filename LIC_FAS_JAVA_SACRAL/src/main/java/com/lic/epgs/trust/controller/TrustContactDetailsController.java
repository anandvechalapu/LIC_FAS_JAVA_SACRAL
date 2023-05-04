package com.lic.epgs.trust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.entity.TrustContactDetails;
import com.lic.epgs.trust.service.TrustContactDetailsService;

@RestController
@RequestMapping("/trust-contact-details")
public class TrustContactDetailsController {

    @Autowired
    private TrustContactDetailsService trustContactDetailsService;

    @GetMapping("/find-by-trust-id")
    public TrustContactDetails findByTrustId(@RequestParam Long trustId) {
        return trustContactDetailsService.findByTrustId(trustId);
    }

    @GetMapping("/find-by-contact-person-id")
    public TrustContactDetails findByContactPersonId(@RequestParam Long contactPersonId) {
        return trustContactDetailsService.findByContactPersonId(contactPersonId);
    }

    @PostMapping("/save")
    public TrustContactDetails save(@RequestBody TrustContactDetails trustContactDetails) {
        return trustContactDetailsService.save(trustContactDetails);
    }

    @PostMapping("/update")
    public TrustContactDetails update(@RequestBody TrustContactDetails trustContactDetails) {
        return trustContactDetailsService.update(trustContactDetails);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody TrustContactDetails trustContactDetails) {
        trustContactDetailsService.delete(trustContactDetails);
    }

}