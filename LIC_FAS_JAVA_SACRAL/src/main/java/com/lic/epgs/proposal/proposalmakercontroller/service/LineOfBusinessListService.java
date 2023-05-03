package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductVariants;
import com.lic.epgs.proposal.proposalmakercontroller.repository.LineOfBusinessListRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineOfBusinessListService {
    
    @Autowired
    private LineOfBusinessListRepository lineOfBusinessListRepository;

    public List<ProductVariants> getLineOfBusinessList(Integer lineOfBusinessId) {
        return lineOfBusinessListRepository.getLineOfBusinessList(lineOfBusinessId);
    }

}