package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.trust.dto.TrustDto;
import com.lic.epgs.trust.entity.TrustEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExistingLoadTrustSearchPageTrustManagementService {
 
    List<TrustDto> findByUnitCodeAndTrustStatusIn(String unitCode, List<String> trustStatuses);
 
    List<TrustDto> findTrustsByUnitCodeAndTrustStatuses(String unitCode, List<String> trustStatuses);
 
    Long countByUnitCodeAndTrustStatusIn(String unitCode, List<String> trustStatuses);
}