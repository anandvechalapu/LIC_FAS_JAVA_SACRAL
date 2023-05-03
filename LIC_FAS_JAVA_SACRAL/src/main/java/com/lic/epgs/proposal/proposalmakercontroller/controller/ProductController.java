package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/{productId}")
    public Product getProductDetailsById(@PathVariable Long productId) {
        return productService.getProductDetailsById(productId);
    }

    @GetMapping("/products/variant/{productVariantId}")
    public Product getProductVariantDetailsById(@PathVariable Long productVariantId) {
        return productService.getProductVariantDetailsById(productVariantId);
    }

}