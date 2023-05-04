package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.LoadInformation;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubcustomerMakercontrollerService;

@RestController
@RequestMapping("/load-information")
public class SubcustomerMakercontrollerController {
	
	@Autowired
	private SubcustomerMakercontrollerService subcustomerMakercontrollerService;
	
	@GetMapping("/findByRoleTypeAndUnitCode")
	public List<LoadInformation> findByRoleTypeAndUnitCode(@RequestParam("roleType") String roleType, 
			@RequestParam("unitCode") String unitCode) {
		return subcustomerMakercontrollerService.findByRoleTypeAndUnitCode(roleType, unitCode);
	}
	
	@GetMapping("/getExistingLoads")
	public List<LoadInformation> getExistingLoads(@RequestParam("roleType") String roleType, 
			@RequestParam("unitCode") String unitCode) {
		return subcustomerMakercontrollerService.getExistingLoads(roleType, unitCode);
	}
	
	@GetMapping("/getExistingLoadsNative")
	public List<LoadInformation> getExistingLoadsNative(@RequestParam("roleType") String roleType, 
			@RequestParam("unitCode") String unitCode) {
		return subcustomerMakercontrollerService.getExistingLoadsNative(roleType, unitCode);
	}
	
	@GetMapping("/getExistingLoadsWithCustomerInfo")
	public List<LoadInformation> getExistingLoadsWithCustomerInfo(@RequestParam("roleType") String roleType, 
			@RequestParam("unitCode") String unitCode) {
		return subcustomerMakercontrollerService.getExistingLoadsWithCustomerInfo(roleType, unitCode);
	}
	
	@GetMapping("/getExistingLoadCount")
	public int getExistingLoadCount(@RequestParam("roleType") String roleType, 
			@RequestParam("unitCode") String unitCode) {
		return subcustomerMakercontrollerService.getExistingLoadCount(roleType, unitCode);
	}

}