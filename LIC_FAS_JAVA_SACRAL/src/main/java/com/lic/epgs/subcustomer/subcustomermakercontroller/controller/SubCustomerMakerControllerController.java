package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubCustomerMakerControllerService;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;

@RestController
public class SubCustomerMakerControllerController {

	@Autowired
	private SubCustomerMakerControllerService subCustomerMakerControllerService;

	@GetMapping("/subCustomer/{subCustomerId}/makerNotes")
	public List<SubCustomerMakerController> getMakerNotesBySubCustomerId(@PathVariable long subCustomerId) {
		return subCustomerMakerControllerService.getMakerNotesBySubCustomerId(subCustomerId);
	}

}