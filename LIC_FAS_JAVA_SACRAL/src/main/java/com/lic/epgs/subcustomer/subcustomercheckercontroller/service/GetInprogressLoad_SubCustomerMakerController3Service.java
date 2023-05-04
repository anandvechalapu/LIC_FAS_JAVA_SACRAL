package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.DataModel;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.GetInprogressLoad_SubCustomerMakerController3Repository;

@Service
public class GetInprogressLoad_SubCustomerMakerController3Service {

	@Autowired
	GetInprogressLoad_SubCustomerMakerController3Repository getInprogressLoad_SubCustomerMakerController3Repository;

	public List<DataModel> getInprogressLoad_SubCustomerMakerController3(String roleType, String unitCode) {
		return getInprogressLoad_SubCustomerMakerController3Repository.getInprogressLoad_SubCustomerMakerController3(roleType, unitCode);
	}
}