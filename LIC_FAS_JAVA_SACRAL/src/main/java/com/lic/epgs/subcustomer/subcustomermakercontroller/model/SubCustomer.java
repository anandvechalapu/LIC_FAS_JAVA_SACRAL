package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcustomer")
public class SubCustomer {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "contact_type")
    private String contactType;

    @Column(name = "city")
    private String city;

    @Column(name = "GCT_flag")
    private String GCTFlag;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "salutation")
    private String salutation;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "designation")
    private String designation;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "std_code")
    private String stdCode;

    @Column(name = "landline_number")
    private String landlineNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "channel_color_code")
    private String channelColorCode;

    @Column(name = "channel_user_id")
    private String channelUserId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGCTFlag() {
        return GCTFlag;
    }

    public void setGCTFlag(String GCTFlag) {
        this.GCTFlag = GCTFlag;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getStdCode() {
        return stdCode;
    }

    public void setStdCode(String stdCode