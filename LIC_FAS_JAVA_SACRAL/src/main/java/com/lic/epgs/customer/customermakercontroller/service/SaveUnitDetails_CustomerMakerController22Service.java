package com.lic.epgs.customer.customermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.model.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.repository.SaveUnitDetails_CustomerMakerController22Repository;

@Service
public class SaveUnitDetails_CustomerMakerController22Service {

	@Autowired
	SaveUnitDetails_CustomerMakerController22Repository saveUnitDetails_CustomerMakerController22Repository;
	
	public CustomerUnitOfficeDto findByCustomerId(Long customerId) {
		return saveUnitDetails_CustomerMakerController22Repository.findByCustomerId(customerId);
	}
	
	public CustomerUnitOfficeDto findByCustomerUnitOfficeId(Long customerUnitOfficeId) {
		return saveUnitDetails_CustomerMakerController22Repository.findByCustomerUnitOfficeId(customerUnitOfficeId);
	}
	
	public void markAsInactiveByCustomerUnitOfficeId(Long customerUnitOfficeId) {
		saveUnitDetails_CustomerMakerController22Repository.markAsInactiveByCustomerUnitOfficeId(customerUnitOfficeId);
	}
	
	public void saveWithSameCreatedByUser(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveWithSameCreatedByUser(customerUnitOfficeDto);
	}
	
	public void saveWithCreateOnTimestamp(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveWithCreateOnTimestamp(customerUnitOfficeDto);
	}
	
	public void saveWithChannelColorCode(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveWithChannelColorCode(customerUnitOfficeDto);
	}
	
	public void saveWithChannelUserId(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveWithChannelUserId(customerUnitOfficeDto);
	}
	
	public void saveWithIsActiveStatus(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveWithIsActiveStatus(customerUnitOfficeDto);
	}
	
	public void saveForEachServicingUnitId(CustomerUnitOfficeDto customerUnitOfficeDto) {
		saveUnitDetails_CustomerMakerController22Repository.saveForEachServicingUnitId(customerUnitOfficeDto);
	}
	
	public CustomerUnitOfficeDto saveAndReturnNewCustomerUnitOfficeDto(CustomerUnitOfficeDto customerUnitOfficeDto) {
		CustomerUnitOfficeDto customerUnitOfficeDtoReturn = saveUnitDetails_CustomerMakerController22Repository.saveAndReturnNewCustomerUnitOfficeDto(customerUnitOfficeDto);
		return customerUnitOfficeDtoReturn;
	}
	
	public Optional<CustomerUnitOfficeDto> findById(Long id) {
		return saveUnitDetails_CustomerMakerController22Repository.findById(id);
	}
}