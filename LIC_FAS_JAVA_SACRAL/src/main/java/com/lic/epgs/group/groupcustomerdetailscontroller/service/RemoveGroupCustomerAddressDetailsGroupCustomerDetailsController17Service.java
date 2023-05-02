package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository;

@Service
public class RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Service {

	@Autowired
	private RemoveGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository;

	public ResponseEntity<?> removeGroupCustomerAddressDetails(String groupCustomerId, String addressId) {

		if (removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository.validateGroupCustomerId(groupCustomerId)
				&& removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository.validateAddressId(addressId)) {
			// insert code to remove address details
			return removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository.generateSuccessResponse();
		} else {
			return removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository.generateFailureResponse();
		}
	}

	public ResponseEntity<?> handleExceptions(Exception e) {
		return removeGroupCustomerAddressDetailsGroupCustomerDetailsController17Repository.handleExceptions(e);
	}
}