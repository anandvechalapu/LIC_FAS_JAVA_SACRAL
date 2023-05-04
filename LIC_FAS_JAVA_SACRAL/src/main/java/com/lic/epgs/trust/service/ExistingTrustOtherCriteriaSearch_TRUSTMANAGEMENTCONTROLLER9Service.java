package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.repository.ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository;
import com.lic.epgs.trust.model.ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9;

@Service
public class ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Service {

    @Autowired
    private ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository;

    public ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9 findByCriteria(String criteria) {
        return existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository.findByCriteria(criteria);
    }

    public List<ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9> findAllByCriteria(String criteria) {
        return existingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9Repository.findAllByCriteria(criteria);
    }
}