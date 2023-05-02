package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsService;

@RestController
@RequestMapping("/api")
public class GroupCustomerDetailsController {

	@Autowired
	GroupCustomerDetailsService groupCustomerDetailsService;
	
	@GetMapping("/GroupCustomerDetails/{id}")
	public ResponseEntity<Optional<GroupCustomerDetails>> getGroupCustomerDetailsById(@PathVariable(value = "id") Long groupCustomerId) {
		Optional<GroupCustomerDetails> groupCustomerDetails = groupCustomerDetailsService.findById(groupCustomerId);
		if(groupCustomerDetails == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(groupCustomerDetails);
	}
	
	@PostMapping("/GroupCustomerDetails")
	public GroupCustomerDetails createGroupCustomerDetails(@RequestBody GroupCustomerDetails groupCustomerDetails) {
		return groupCustomerDetailsService.save(groupCustomerDetails);
	}
	
	@PutMapping("/GroupCustomerDetails/{id}")
	public ResponseEntity<GroupCustomerDetails> updateGroupCustomerDetails(@PathVariable(value = "id") Long groupCustomerId,
			@RequestBody GroupCustomerDetails groupCustomerDetailsDetails) {
		GroupCustomerDetails groupCustomerDetails = groupCustomerDetailsService.findById(groupCustomerId).get();
		if(groupCustomerDetails == null) {
			return ResponseEntity.notFound().build();
		}
		groupCustomerDetails.setBasicDetailsName(groupCustomerDetailsDetails.getBasicDetailsName());
		groupCustomerDetails.setType(groupCustomerDetailsDetails.getType());
		groupCustomerDetails.setContactDetailsPrimaryContactName(groupCustomerDetailsDetails.getContactDetailsPrimaryContactName());
		groupCustomerDetails.setContactDetailsPrimaryContactNumber(groupCustomerDetailsDetails.getContactDetailsPrimaryContactNumber());
		groupCustomerDetails.setAddressDetailsAddressLine(groupCustomerDetailsDetails.getAddressDetailsAddressLine());
		groupCustomerDetails.setAddressDetailsCity(groupCustomerDetailsDetails.getAddressDetailsCity());
		groupCustomerDetails.setGroupCustomerDetailsCustomerId(groupCustomerDetailsDetails.getGroupCustomerDetailsCustomerId());
		groupCustomerDetails.setGroupCustomerDetailsCustomerName(groupCustomerDetailsDetails.getGroupCustomerDetailsCustomerName());
		groupCustomerDetails.setNotes(groupCustomerDetailsDetails.getNotes());
		groupCustomerDetails.setBankAccountDetailsAccountNumber(groupCustomerDetailsDetails.getBankAccountDetailsAccountNumber());
		groupCustomerDetails.setBankAccountDetailsBankName(groupCustomerDetailsDetails.getBankAccountDetailsBankName());
		
		GroupCustomerDetails updatedGroupCustomerDetails = groupCustomerDetailsService.save(groupCustomerDetails);
		return ResponseEntity.ok(updatedGroupCustomerDetails);
	}
	
	@DeleteMapping("/GroupCustomerDetails/{id}")
	public ResponseEntity<GroupCustomerDetails> deleteGroupCustomerDetails(@PathVariable(value = "id") Long groupCustomerId) {
		GroupCustomerDetails groupCustomerDetails = groupCustomerDetailsService.findById(groupCustomerId).get();
		if(groupCustomerDetails == null) {
			return ResponseEntity.notFound().build();
		}
		groupCustomerDetailsService.deleteById(groupCustomerId);
		return ResponseEntity.ok().build