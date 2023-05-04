package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomer;

public interface SubCustomerRepository extends JpaRepository<SubCustomer, Long> {

    SubCustomer findByCustomerId(Long customerId);

    void saveSubCustomerContactDetails(SubCustomer subCustomer);

    void updateSubCustomerContactDetails(SubCustomer subCustomer);

    void deleteSubCustomerContactDetails(SubCustomer subCustomer);

    SubCustomer findByContactType(String contactType);

    SubCustomer findByCity(String city);

    SubCustomer findByGCTFlag(String GCTFlag);

    SubCustomer findByDepartmentName(String departmentName);

    SubCustomer findBySalutation(String salutation);

    SubCustomer findByFirstName(String firstName);

    SubCustomer findByMiddleName(String middleName);

    SubCustomer findByLastName(String lastName);

    SubCustomer findByDesignation(String designation);

    SubCustomer findByCountryCode(String countryCode);

    SubCustomer findByMobileNumber(String mobileNumber);

    SubCustomer findByStdCode(String stdCode);

    SubCustomer findByLandlineNumber(String landlineNumber);

    SubCustomer findByEmailId(String emailId);

    SubCustomer findByChannelColorCode(String channelColorCode);

    SubCustomer findByChannelUserId(String channelUserId);
}