package com.lic.epgs.trust.controller;

import com.lic.epgs.trust.dto.CommonTrustDto;
import com.lic.epgs.trust.service.TrustManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trust")
public class TrustManagementController {

    @Autowired
    private TrustManagementService trustManagementService;

    @GetMapping("/{trustId}")
    public ResponseEntity<CommonTrustDto> getTrustById(@PathVariable Long trustId) {
        CommonTrustDto trust = trustManagementService.getTrustById(trustId);
        return new ResponseEntity<>(trust, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CommonTrustDto> saveTrust(@RequestBody CommonTrustDto trustDto) {
        trustManagementService.saveTrust(trustDto);
        return new ResponseEntity<>(trustDto, HttpStatus.CREATED);
    }

}