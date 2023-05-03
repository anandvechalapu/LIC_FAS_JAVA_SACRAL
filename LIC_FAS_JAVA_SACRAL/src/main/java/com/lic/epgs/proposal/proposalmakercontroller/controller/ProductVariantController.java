package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productVariant")
public class ProductVariantController {

    @Autowired
    private ProductVariantService productVariantService;

    @GetMapping("/getProductVariantNameList")
    public CommonResponseDto getProductVariantNameList() {
        return productVariantService.getProductVariantNameList();
    }

}