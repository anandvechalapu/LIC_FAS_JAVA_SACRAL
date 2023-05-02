package com.lic.epgs.group.groupcustomercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomercheckercontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.service.GroupCustomerCheckerService;

@RestController
@RequestMapping("/groupcustomerchecker")
public class GroupCustomerCheckerController {
	
	@Autowired
	private GroupCustomerCheckerService groupCustomerCheckerService;

	@GetMapping("/{groupCustomerId}")
	public GroupCustomerBasicDetailsDto getGroupCustomerDetails(@PathVariable("groupCustomerId") String groupCustomerId){
		return groupCustomerCheckerService.getGroupCustomerDetails(groupCustomerId);
	}
	
	@PostMapping
	public void saveGroupCustomerDetails(@RequestBody GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity){
		groupCustomerCheckerService.save(groupCustomerBasicDetailsEntity);
	}
	
	@PutMapping
	public void updateGroupCustomerDetails(@RequestBody GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity){
		groupCustomerCheckerService.save(groupCustomerBasicDetailsEntity);
	}
}