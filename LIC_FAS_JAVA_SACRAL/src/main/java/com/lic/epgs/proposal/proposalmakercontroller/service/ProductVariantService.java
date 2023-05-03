package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProductVariant;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductVariantService {

    @Autowired
    private ProductVariantRepository productVariantRepository;

    public CommonResponseDto getProductVariantNameList() {
        List<ProductVariant> productVariants = productVariantRepository.getProductVariantNameList_PROPOSALMAKERCONTROLLER14();
        return new CommonResponseDto(productVariants);
    }

}