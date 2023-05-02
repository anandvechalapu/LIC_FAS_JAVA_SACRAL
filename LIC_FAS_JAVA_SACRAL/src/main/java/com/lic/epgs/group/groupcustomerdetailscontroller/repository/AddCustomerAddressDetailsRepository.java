package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.Address;

@Repository
public interface AddCustomerAddressDetailsRepository extends JpaRepository<Address, Long> {

    Address findByAddressType(String addressType);
    Address findByCountry(String country);
    Address findByState(String state);
    Address findByDistrict(String district);
    Address findByTown(String town);
    Address findByAddressLine1(String addressLine1);
    Address findByAddressLine2(String addressLine2);
    Address findByAddressLine3(String addressLine3);

    void save(Address address);
    void update(Address address);
}