package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.LoadInformation;

@Repository
public interface SubcustomerMakercontrollerService {
	
	List<LoadInformation> findByRoleTypeAndUnitCode(String roleType, String unitCode);
	
	List<LoadInformation> getExistingLoads(String roleType, String unitCode);
	
	List<LoadInformation> getExistingLoadsNative(String roleType, String unitCode);
	
	List<LoadInformation> getExistingLoadsWithCustomerInfo(String roleType, String unitCode);
	
	int getExistingLoadCount(String roleType, String unitCode);
	
}