package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product getProductDetailsById(Long productId) {
        return productRepository.findProductDetailsById(productId);
    }

    public Product getProductVariantDetailsById(Long productVariantId) {
        return productRepository.findProductVariantDetailsById(productVariantId);
    }
}