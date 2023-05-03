package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetCustomerCheckerResponse;
import com.lic.epgs.proposal.proposalmakercontroller.repository.GetTrustDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTrustDetailsService {

    @Autowired
    private GetTrustDetailsRepository getTrustDetailsRepository;

    public GetCustomerCheckerResponse getTrustDetailsByTrustId(Long trustId) {
        return getTrustDetailsRepository.findByTrustId(trustId);
    }

}