package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.repository.CrudRepository;

import com.lic.epgs.customer.customercheckercontroller.model.CustomerGroupCompanyDetails;

public interface SaveCustomerGroupCompanyDetails_CustomerMakerControllerRepository extends CrudRepository<CustomerGroupCompanyDetails, Integer> {

	public boolean saveCustomerGroupCompanyDetails(int customerId, int groupId);
	
	public CustomerGroupCompanyDetails findByCustomerIdAndGroupId(int customerId, int groupId);
	
}