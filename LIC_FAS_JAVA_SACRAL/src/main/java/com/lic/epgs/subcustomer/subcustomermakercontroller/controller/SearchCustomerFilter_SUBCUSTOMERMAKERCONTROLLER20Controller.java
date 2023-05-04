package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Service;

@RestController
public class SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Controller {
	
	@Autowired
	private SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Service searchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Service;
	
	@GetMapping("/search-customer")
	public List<Customer> searchCustomerByCriteria(@RequestParam String customerCode, 
			@RequestParam String customerName, 
			@RequestParam String customerType, 
			@RequestParam String pan, 
			@RequestParam String fromDate, 
			@RequestParam String toDate,
			@RequestParam String status) {
		
		return searchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Service.searchCustomerByCriteria(customerCode, customerName, customerType, pan, fromDate, toDate, status);
		
	}

}