package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProductVariant;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductVariantListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proposalmakercontroller13")
public class ProposalMakerController13 {

    @Autowired
    private ProductVariantListService productVariantListService;

    @GetMapping("/{productId}")
    public List<ProductVariant> getProductVariantList(@PathVariable Long productId) {
        return productVariantListService.getProductVariantList_PROPOSALMAKERCONTROLLER13(productId);
    }

}