package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCustomerService {

    @Autowired
    private SubCustomerRepository subCustomerRepository;

    public SubCustomer findByCustomerId(Long customerId) {
        return subCustomerRepository.findByCustomerId(customerId);
    }

    public void saveSubCustomerContactDetails(SubCustomer subCustomer) {
        subCustomerRepository.saveSubCustomerContactDetails(subCustomer);
    }

    public void updateSubCustomerContactDetails(SubCustomer subCustomer) {
        subCustomerRepository.updateSubCustomerContactDetails(subCustomer);
    }

    public void deleteSubCustomerContactDetails(SubCustomer subCustomer) {
        subCustomerRepository.deleteSubCustomerContactDetails(subCustomer);
    }

    public SubCustomer findByContactType(String contactType) {
        return subCustomerRepository.findByContactType(contactType);
    }

    public SubCustomer findByCity(String city) {
        return subCustomerRepository.findByCity(city);
    }

    public SubCustomer findByGCTFlag(String GCTFlag) {
        return subCustomerRepository.findByGCTFlag(GCTFlag);
    }

    public SubCustomer findByDepartmentName(String departmentName) {
        return subCustomerRepository.findByDepartmentName(departmentName);
    }

    public SubCustomer findBySalutation(String salutation) {
        return subCustomerRepository.findBySalutation(salutation);
    }

    public SubCustomer findByFirstName(String firstName) {
        return subCustomerRepository.findByFirstName(firstName);
    }

    public SubCustomer findByMiddleName(String middleName) {
        return subCustomerRepository.findByMiddleName(middleName);
    }

    public SubCustomer findByLastName(String lastName) {
        return subCustomerRepository.findByLastName(lastName);
    }

    public SubCustomer findByDesignation(String designation) {
        return subCustomerRepository.findByDesignation(designation);
    }

    public SubCustomer findByCountryCode(String countryCode) {
        return subCustomerRepository.findByCountryCode(countryCode);
    }

    public SubCustomer findByMobileNumber(String mobileNumber) {
        return subCustomerRepository.findByMobileNumber(mobileNumber);
    }

    public SubCustomer findByStdCode(String stdCode) {
        return subCustomerRepository.findByStdCode(stdCode);
    }

    public SubCustomer findByLandlineNumber(String landlineNumber) {
        return subCustomerRepository.findByLandlineNumber(landlineNumber);
    }

    public SubCustomer findByEmailId(String emailId) {
        return subCustomerRepository.findByEmailId(emailId);
    }

    public SubCustomer findByChannelColorCode(String channelColorCode) {
        return subCustomerRepository.findByChannelColorCode(channelColorCode);
    }

    public SubCustomer findByChannelUserId(String channelUserId) {
        return subCustomerRepository.findByChannelUserId(channelUserId);
    }
}