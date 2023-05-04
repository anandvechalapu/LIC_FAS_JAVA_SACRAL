package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.entity.Trust;
import com.lic.epgs.trust.service.InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Service;

@RestController
@RequestMapping("/trust")
public class InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Controller {

    @Autowired
    private InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Service inProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Service;

    @GetMapping("/role/{role}")
    public List<Trust> findTrustByRole(@PathVariable String role) {
        return inProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Service.findTrustByRole(role);
    }

}