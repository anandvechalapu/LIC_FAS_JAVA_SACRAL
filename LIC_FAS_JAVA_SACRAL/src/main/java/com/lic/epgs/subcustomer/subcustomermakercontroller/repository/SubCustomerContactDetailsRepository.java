package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerContactDetails;

public interface SubCustomerContactDetailsRepository extends JpaRepository<SubCustomerContactDetails, Long> {
    SubCustomerContactDetails save(SubCustomerContactDetails subCustomerContactDetails);
    void updateContactType(Long id, String contactType);
    void updateCity(Long id, String city);
    void updateGCTFlag(Long id, Boolean gctFlag);
    void updateDepartmentName(Long id, String departmentName);
    void updateSalutation(Long id, String salutation);
    void updateFirstName(Long id, String firstName);
    void updateMiddleName(Long id, String middleName);
    void updateLastName(Long id, String lastName);
    void updateDesignation(Long id, String designation);
    void updateCountryCode(Long id, String countryCode);
    void updateMobileNumber(Long id, String mobileNumber);
    void updateStdCode(Long id, String stdCode);
    void updateLandlineNumber(Long id, String landlineNumber);
    void updateEmailID(Long id, String emailID);
    void updateChannelColorCode(Long id, String channelColorCode);
    void updateChannelUserID(Long id, String channelUserID);
}