package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.dto.DocumentDetailsDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AddCustomerDocumentDetails_CustomerMakerControllerRepository extends JpaRepository<DocumentDetailsDto, Long> {
	
	@Query("SELECT d.documentId FROM DocumentDetailsDto d WHERE d.customerId = ?1")
	public Long findDocumentIdByCustomerId(Long customerId);
	
	@Modifying
	@Transactional
	@Query("UPDATE DocumentDetailsDto d SET d.documentName = ?1, d.documentNumber = ?2, d.documentType = ?3, d.documentExpiryDate = ?4 WHERE d.documentId = ?5")
	public void updateDocumentDetailsByDocumentId(String documentName, String documentNumber, String documentType, String documentExpiryDate, Long documentId);
	
	@Transactional
	public DocumentDetailsDto save(DocumentDetailsDto documentDetailsDto);
	
	@Query("SELECT new com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto(d.documentId, d.documentName, d.documentNumber, d.documentType, d.documentExpiryDate) FROM DocumentDetailsDto d WHERE d.documentId = ?1")
	public CommonResponseDto getDocumentDetails(Long documentId);

}