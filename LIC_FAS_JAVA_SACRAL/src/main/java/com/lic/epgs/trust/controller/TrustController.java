package com.lic.epgs.trust.controller;

import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.BankAccountDetailsTempEntity;
import com.lic.epgs.trust.entity.ContactDetailsTempEntity;
import com.lic.epgs.trust.entity.TrustDetailsTempEntity;
import com.lic.epgs.trust.service.TrustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/trust")
public class TrustController {

    @Autowired
    private TrustService trustService;

    @GetMapping(path = "/findByTrustId/{trustId}")
    public TrustDetailsTempEntity findByTrustId(@PathVariable Long trustId) {
        return trustService.findByTrustId(trustId);
    }

    @GetMapping(path = "/findByTrustIdAndIsActive/{trustId}/{isActive}")
    public List<BankAccountDetailsTempEntity> findByTrustIdAndIsActive(@PathVariable Long trustId, @PathVariable Boolean isActive) {
        return trustService.findByTrustIdAndIsActive(trustId, isActive);
    }

    @PostMapping(path = "/saveBankAccountDetails")
    public BankAccountDetailsEntity save(@RequestBody BankAccountDetailsEntity bankAccountDetailsEntity) {
        return trustService.save(bankAccountDetailsEntity);
    }

    @GetMapping(path = "/findContactDetailsTempEntityByTrustIdAndIsActive/{trustId}/{isActive}")
    public List<ContactDetailsTempEntity> findContactDetailsTempEntityByTrustIdAndIsActive(@PathVariable Long trustId, @PathVariable Boolean isActive) {
        return trustService.findContactDetailsTempEntityByTrustIdAndIsActive(trustId, isActive);
    }

    @PostMapping(path = "/save")
    public TrustDetailsTempEntity save(@RequestBody TrustDetailsTempEntity trustDetailsTempEntity) {
        return trustService.save(trustDetailsTempEntity);
    }

    @PostMapping(path = "/saveTrustDetails/{role}")
    public TrustDetailsTempEntity saveTrustDetails(@RequestBody TrustDetailsDto trustDetailsDto, @PathVariable String role) {
        return trustService.saveTrustDetails(trustDetailsDto, role);
    }

}