package com.lic.epgs.trust.controller;

import com.lic.epgs.trust.entity.ContactEntityList;
import com.lic.epgs.trust.dto.CommonTrustDto;
import com.lic.epgs.trust.dto.ContactDetailsDto;
import com.lic.epgs.trust.service.TrustContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trust/contact")
public class TrustContactDetailsController {

    @Autowired
    private TrustContactDetailsService trustContactDetailsService;

    @GetMapping
    public ResponseEntity<CommonTrustDto> listTrustContacts(@RequestParam Long trustId) {
        CommonTrustDto commonTrustDto = trustContactDetailsService.listTrustContacts(trustId);
        return new ResponseEntity<>(commonTrustDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ContactDetailsDto> saveContactDetails(@RequestBody ContactEntityList contactEntityList) {
        ContactDetailsDto contactDetailsDto = trustContactDetailsService.saveContactDetails(contactEntityList);
        return new ResponseEntity<>(contactDetailsDto, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteContactDetails(@RequestBody ContactEntityList contactEntityList) {
        trustContactDetailsService.deleteContactDetails(contactEntityList);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}