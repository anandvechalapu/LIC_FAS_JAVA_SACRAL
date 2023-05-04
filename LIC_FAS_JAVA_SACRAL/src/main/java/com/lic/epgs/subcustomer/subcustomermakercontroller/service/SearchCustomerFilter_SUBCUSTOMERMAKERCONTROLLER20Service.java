package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.Customer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Repository;

@Service
public class SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Service {

	@Autowired
	private SearchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Repository searchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Repository;
	
	public List<Customer> searchCustomerByCriteria(String customerCode, 
			String customerName, 
			String customerType, 
			String pan, 
			String fromDate, 
			String toDate,
			String status) {
		
		return searchCustomerFilter_SUBCUSTOMERMAKERCONTROLLER20Repository.searchCustomerByCriteria(customerCode, customerName, customerType, pan, fromDate, toDate, status);
		
	}
}