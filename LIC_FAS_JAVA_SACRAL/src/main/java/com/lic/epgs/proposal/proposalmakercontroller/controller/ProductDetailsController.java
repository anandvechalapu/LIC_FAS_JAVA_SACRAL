package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proposal")
public class ProductDetailsController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @GetMapping("/product-name-list")
    public List<ProductDetailsDto> getProductNameList() {
        return productDetailsService.getProductNameList();
    }

}