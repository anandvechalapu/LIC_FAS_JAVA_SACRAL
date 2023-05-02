package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerNotesDetailsService;

@RestController
public class GroupCustomerNotesDetailsController {

	@Autowired
	private GroupCustomerNotesDetailsService groupCustomerNotesDetailsService;

	@GetMapping("/group-customer-notes-details/{groupCustomerId}")
	public List<GroupCustomerNotesDetails> getGroupCustomerNotesByGroupCustomerId(@PathVariable Long groupCustomerId, @RequestParam(value = "startDate", required = false) String startDate,
			@RequestParam(value = "endDate", required = false) String endDate) {
		return groupCustomerNotesDetailsService.getGroupCustomerNotesByGroupCustomerIdAndDateRange(groupCustomerId, startDate, endDate);
	}

}