package com.lic.epgs.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.integration.model.AccountingIntegrationRequestDto;

@Repository
public interface ControllerIntegrationRepository extends JpaRepository<AccountingIntegrationRequestDto, Long> {
	
	@Query("SELECT a.schemeName, a.mphCode, a.mphName, a.mphNo, a.mphMobileNo, a.mphEmail, a.mphAddress1, a.mphAddress2, a.district, a.state, a.pinCode, a.servicingUnitName, a.servicingUnitAddress1, a.servicingUnitAddress2, a.servicingUnitAddress3, a.servicingUnitAddress4, a.servicingUnitCity, a.servicingUnitPinCode, a.servicingUnitEmail, a.servicingUnitPhoneNo, a.operatingUnitType, a.unitCode, a.iCodeForLob, a.iCodeForProductLine, a.iCodeForVariant, a.iCodeForBusinessType, a.iCodeForParticipatingType, a.iCodeForBusinessSegment, a.iCodeForInvestmentPortfolio FROM AccountingIntegrationRequestDto a WHERE a.commonmasterserviceUnitByCode = ?1")
	AccountingIntegrationRequestDto getProposalDetails(String commonmasterserviceUnitByCode);
	
}