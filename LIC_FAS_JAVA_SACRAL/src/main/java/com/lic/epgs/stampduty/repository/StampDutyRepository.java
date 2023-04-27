package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.entity.StampDuty;

@Repository
public interface StampDutyRepository extends JpaRepository<StampDuty, Long> {

	@Query(value = "SELECT s FROM StampDuty s WHERE s.challanGrnNo = ?1 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByChallanGrnNo(String challanGrnNo);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.challanGrnDate = ?1 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByChallanGrnDate(String challanGrnDate);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.modifiedDate BETWEEN ?1 AND ?2 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByModifiedDateBetween(String fromDate, String toDate);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.roleType = ?1 AND s.stampDutyStatus IS NULL AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByRoleTypeMaker(String roleType);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.roleType = ?1 AND s.stampDutyStatus IS NULL AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByRoleTypeChecker(String roleType);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.stampDutyStatus = ?1 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByStampDutyStatus(String stampDutyStatus);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.unitOfficeCode = ?1 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByUnitOfficeCode(String unitOfficeCode);
	
	@Query(value = "SELECT s FROM StampDuty s WHERE s.modifiedDate BETWEEN ?1 AND ?2 AND s.active = true ORDER BY s.modifiedDate DESC")
	public StampDuty findByModifiedDateBetweenWithPagination(String fromDate, String toDate, Integer pageCount, Integer limit);
	
}