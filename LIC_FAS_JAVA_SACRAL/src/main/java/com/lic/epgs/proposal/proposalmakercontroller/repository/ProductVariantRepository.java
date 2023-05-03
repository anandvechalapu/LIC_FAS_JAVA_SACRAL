package com.lic.epgs.proposal.proposalmakercontroller.repository;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProductVariant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductVariantRepository extends CrudRepository<ProductVariant, Long> {

    /**
     * Method to retrieve a list of product variants and subvariants from the repository.
     *
     * @return a list of product variants and subvariants
     */
    List<ProductVariant> getProductVariantNameList_PROPOSALMAKERCONTROLLER14();
}