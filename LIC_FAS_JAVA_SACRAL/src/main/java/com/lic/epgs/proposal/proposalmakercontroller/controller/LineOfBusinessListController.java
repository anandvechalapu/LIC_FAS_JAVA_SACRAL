package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductVariants;
import com.lic.epgs.proposal.proposalmakercontroller.service.LineOfBusinessListService;

@RestController
public class LineOfBusinessListController {
    
    @Autowired
    private LineOfBusinessListService lineOfBusinessListService;

    @GetMapping("/lineOfBusinessList/{lineOfBusinessId}")
    public List<ProductVariants> getLineOfBusinessList(@PathVariable Integer lineOfBusinessId) {
        return lineOfBusinessListService.getLineOfBusinessList(lineOfBusinessId);
    }

}