package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.entity.ProductDetailsEntity;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsService {

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public List<ProductDetailsDto> getProductNameList() {
        return productDetailsRepository.getProductNameList();
    }

}