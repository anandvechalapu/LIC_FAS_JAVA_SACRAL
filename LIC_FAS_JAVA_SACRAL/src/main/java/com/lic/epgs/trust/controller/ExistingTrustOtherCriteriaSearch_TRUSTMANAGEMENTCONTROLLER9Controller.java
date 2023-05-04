package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9;
import com.lic.epgs.trust.service.ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service;

@RestController
public class ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Controller {

    @Autowired
    private ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service;

    @GetMapping("/criteria/{criteria}")
    public ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9 findByCriteria(@PathVariable String criteria) {
        return existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service.findByCriteria(criteria);
    }

    @GetMapping("/criterias/{criteria}")
    public List<ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9> findAllByCriteria(@PathVariable String criteria) {
        return existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service.findAllByCriteria(criteria);
    }
}