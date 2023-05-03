package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProductListRepository;

@Service
public class ProductListService {

	@Autowired
	private ProductListRepository productListRepository;
	
	public List<Product> getProductListByProductType(String productType) {
		return productListRepository.findByProductType(productType);
	}
}