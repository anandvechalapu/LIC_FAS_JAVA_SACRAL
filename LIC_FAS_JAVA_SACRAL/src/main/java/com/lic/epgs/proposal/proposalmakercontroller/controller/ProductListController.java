package com.lic.epgs.proposal.proposalmakercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;

@Repository
public interface ProductListRepository extends JpaRepository<Product, Long> {

	List<Product> findByProductType(String productType);
	
}

package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.Product;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProductListService;

@RestController
public class ProductListController {

	@Autowired
	private ProductListService productListService;
	
	@GetMapping("/products/{productType}")
	public List<Product> getProductListByProductType(@PathVariable String productType) {
		return productListService.getProductListByProductType(productType);
	}
	
}