package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.CommonTrustDto;

@Repository
public interface InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository extends JpaRepository<CommonTrustDto, Long> {
	
	List<CommonTrustDto> findCommonTrustDtoByRoleAndUnitCode(String role, String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.status = 'In Progress Maker'")
	List<CommonTrustDto> findByStatusInProgressMaker();
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.status = 'In Progress Checker'")
	List<CommonTrustDto> findByStatusInProgressChecker();
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode")
	List<CommonTrustDto> findByRoleAndUnitCode(@Param("role") String role, @Param("unitCode") String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode AND t.status = 'In Progress Maker'")
	List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressMaker(@Param("role") String role, @Param("unitCode") String unitCode);
	
	@Query("SELECT t FROM CommonTrustDto t WHERE t.role = :role AND t.unitCode = :unitCode AND t.status = 'In Progress Checker'")
	List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressChecker(@Param("role") String role, @Param("unitCode") String unitCode);
}

@Service
public class InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Service {
	
	@Autowired
	InProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository;
	
	public List<CommonTrustDto> findCommonTrustDtoByRoleAndUnitCode(String role, String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findCommonTrustDtoByRoleAndUnitCode(role, unitCode);
	}
	
	public List<CommonTrustDto> findByStatusInProgressMaker() {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findByStatusInProgressMaker();
	}
	
	public List<CommonTrustDto> findByStatusInProgressChecker() {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findByStatusInProgressChecker();
	}
	
	public List<CommonTrustDto> findByRoleAndUnitCode(String role, String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findByRoleAndUnitCode(role, unitCode);
	}
	
	public List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressMaker(String role, String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findByRoleAndUnitCodeAndStatusInProgressMaker(role, unitCode);
	}
	
	public List<CommonTrustDto> findByRoleAndUnitCodeAndStatusInProgressChecker(String role, String unitCode) {
		return inProgressloadTrustSearchPageTRUSTMANAGEMENTCONTROLLER14Repository.findByRoleAndUnitCodeAndStatusInProgressChecker(role, unitCode);
	}
}