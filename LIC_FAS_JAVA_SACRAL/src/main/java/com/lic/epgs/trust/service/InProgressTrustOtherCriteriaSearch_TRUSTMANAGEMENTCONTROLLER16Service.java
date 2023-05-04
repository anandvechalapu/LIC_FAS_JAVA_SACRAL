package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.entity.Trust;
import com.lic.epgs.trust.repository.InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Repository;

@Service
public class InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Service {

    @Autowired
    private InProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Repository inProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Repository;

    public List<Trust> findTrustByRole(String role) {
        return inProgressTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER16Repository.findTrustByRole(role);
    }
}