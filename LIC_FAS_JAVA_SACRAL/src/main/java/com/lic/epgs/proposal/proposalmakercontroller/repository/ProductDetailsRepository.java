package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.entity.ProductDetailsEntity;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetailsEntity, Long> {

	@Query("SELECT new com.lic.epgs.proposal.proposalmakercontroller.dto.ProductDetailsDto(p.leadProductId, p.productName) FROM ProductDetailsEntity p")
	ProductDetailsDto[] getProductNameList_PROPOSALMAKERCONTROLLER11();

}