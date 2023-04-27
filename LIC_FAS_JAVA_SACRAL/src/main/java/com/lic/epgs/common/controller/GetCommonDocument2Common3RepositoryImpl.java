@Repository
public class GetCommonDocument2Common3RepositoryImpl implements GetCommonDocument2Common3Repository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CommonDocument2Common3DTO> getCommonDocument2Common3(Long productId, Long variantId, String category,
			String subCategory) {
		Query query = entityManager.createNativeQuery(
				"SELECT CD2C3_ID as id,CD2C3_PRODUCT_ID as productId, CD2C3_VARIANT_ID as variantId, CD2C3_CATEGORY as category, CD2C3_SUB_CATEGORY as subCategory, CD2C3_DOCUMENT_NAME as documentName, CD2C3_DOCUMENT_DESCRIPTION as documentDescription, CD2C3_DOCUMENT_TYPE as documentType, CD2C3_DOCUMENT_FILE as documentFile FROM COMMON_DOCUMENT2_COMMON3 where CD2C3_PRODUCT_ID = :productId and CD2C3_VARIANT_ID = :variantId and CD2C3_CATEGORY = :category and CD2C3_SUB_CATEGORY = :subCategory");
		query.setParameter("productId", productId);
		query.setParameter("variantId", variantId);
		query.setParameter("category", category);
		query.setParameter("subCategory", subCategory);
		List<Object[]> rows = query.getResultList();
		List<CommonDocument2Common3DTO> commonDocument2Common3DTOs = new ArrayList<>();
		for (Object[] row : rows) {
			CommonDocument2Common3DTO dto = new CommonDocument2Common3DTO();
			dto.setId(((BigInteger) row[0]).longValue());
			dto.setProductId(((BigInteger) row[1]).longValue());
			dto.setVariantId(((BigInteger) row[2]).longValue());
			dto.setCategory((String) row[3]);
			dto.setSubCategory((String) row[4]);
			dto.setDocumentName((String) row[5]);
			dto.setDocumentDescription((String) row[6]);
			dto.setDocumentType((String) row[7]);
			dto.setDocumentFile((String) row[8]);
			commonDocument2Common3DTOs.add(dto);
		}
		return commonDocument2Common3DTOs;
	}

}

package com.lic.epgs.common.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.dto.CommonDocument2Common3DTO;
import com.lic.epgs.common.exception.ApplicationException;
import com.lic.epgs.common.service.GetCommonDocument2Common3Repository;
import com.lic.epgs.common.service.GetCommonDocument2Common3Service;

@RestController
public class CommonDocument2Common3Controller {
	
	@Autowired
	private GetCommonDocument2Common3Service getCommonDocument2Common3Service;
	
	@Autowired
	private GetCommonDocument2Common3Repository repository;

	@GetMapping("/getCommonDocument2Common3")
	public List<CommonDocument2Common3DTO> getCommonDocument2Common3(@RequestParam Long productId,
			@RequestParam Long variantId, @RequestParam String category, @RequestParam String subCategory)
			throws ApplicationException {
		List<CommonDocument2Common3DTO> commonDocument2