package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;

@RestController
@RequestMapping("/groupcustomerdetails")
public class GroupCustomerDetailsController {
	
	@Autowired
	GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;
	
	@GetMapping("/findbygroupname")
	public ResponseEntity<Object> findByGroupName(@RequestParam(value="groupName") String groupName) {
		GroupCustomerDetailsController groupCustomerDetailsController = groupCustomerDetailsControllerService.findByGroupName(groupName).orElse(null);
		if(groupCustomerDetailsController != null) {
			return new ResponseEntity<>(groupCustomerDetailsController, HttpStatus.OK);
		}
		return new ResponseEntity<>("No such group name", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveGroupCustomerBasicDetails(@RequestBody GroupCustomerDetailsController groupCustomerDetailsController) {
		groupCustomerDetailsControllerService.saveGroupCustomerBasicDetails(groupCustomerDetailsController.getGroupName(), 
				groupCustomerDetailsController.getCustomerName(), groupCustomerDetailsController.getCustomerNumber(), 
				groupCustomerDetailsController.getId());
		return new ResponseEntity<>("Group Customer Details Saved Successfully", HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<String> updateGroupCustomerRelatedDetails(@RequestBody GroupCustomerDetailsController groupCustomerDetailsController) {
		groupCustomerDetailsControllerService.updateGroupCustomerRelatedDetails(groupCustomerDetailsController.getGroupName(), 
				groupCustomerDetailsController.getCustomerName(), groupCustomerDetailsController.getCustomerNumber(), 
				groupCustomerDetailsController.getId());
		return new ResponseEntity<>("Group Customer Details Updated Successfully", HttpStatus.OK);
	}

}