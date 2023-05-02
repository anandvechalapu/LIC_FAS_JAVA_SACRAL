package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;

@Repository
public interface GroupCustomerDetailsControllerRepository extends JpaRepository<GroupCustomerDetailsController, Long> {

	GroupCustomerDetailsController updateGroupStatus(Long id, boolean status, String modifiedBy, String modifiedOn);

}

package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;

@RestController
public class GroupCustomerDetailsControllerController {
	
	@Autowired
	GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;
	
	@PutMapping("/updateGroupStatus")
	public GroupCustomerDetailsController updateGroupStatus(@RequestParam Long id, @RequestParam boolean status, @RequestParam String modifiedBy, @RequestParam String modifiedOn) {
		return groupCustomerDetailsControllerService.updateGroupStatus(id, status, modifiedBy, modifiedOn);
	}

}