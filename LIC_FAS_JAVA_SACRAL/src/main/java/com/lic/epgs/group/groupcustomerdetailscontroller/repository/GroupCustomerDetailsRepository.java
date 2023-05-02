package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;

public interface GroupCustomerDetailsRepository extends JpaRepository<GroupCustomerDetails, Long> {
	
	GroupCustomerDetails findByGroupCustomerId(Long groupCustomerId);
	
	GroupCustomerDetails findByBasicDetailsNameAndType(String name, String type);
	
	GroupCustomerDetails findByContactDetailsPrimaryContactNameAndNumber(String contactName, String contactNumber);
	
	GroupCustomerDetails findByAddressDetailsAddressLineAndCity(String addressLine, String city);
	
	GroupCustomerDetails findByGroupCustomerDetailsCustomerIdAndName(Long customerId, String customerName);
	
	GroupCustomerDetails findByNotes(String notes);
	
	GroupCustomerDetails findByBankAccountDetailsAccountNumberAndBankName(String accountNumber, String bankName);
	
	GroupCustomerDetails findByGroupCustomerIdAndReturnErrorMessage(Long groupCustomerId);

}