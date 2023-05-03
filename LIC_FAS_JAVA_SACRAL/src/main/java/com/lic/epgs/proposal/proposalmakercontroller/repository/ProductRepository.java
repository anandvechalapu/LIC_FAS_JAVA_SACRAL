package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductDetailsById(Long productId);
    Product findProductVariantDetailsById(Long productVariantId);

}