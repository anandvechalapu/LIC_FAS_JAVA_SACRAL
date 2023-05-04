package com.lic.epgs.subcustomer.subcustomermakercontroller.repository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.AddressDetailsDto;
import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.AddressDetailsTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubcustomerMakercontrollerRepository extends JpaRepository<AddressDetailsTempEntity, Long> {

    @Modifying
    @Query("UPDATE AddressDetailsTempEntity a SET a.subcustomerId = ?1, a.addressType = ?2, a.addressTypeName = ?3, a.country = ?4, a.state = ?5, a.district = ?6, a.addressLine1 = ?7, a.addressLine2 = ?8, a.addressLine3 = ?9, a.town = ?10, a.locality = ?11, a.pin = ?12, a.gcFlag = ?13, a.printFlag = ?14, a.createdBy = ?15, a.modifiedBy = ?16 WHERE a.id = ?17")
    int updateSubCustomerAddressDetails(Long subcustomerId, String addressType, String addressTypeName, String country, String state, String district, String addressLine1, String addressLine2, String addressLine3, String town, String locality, String pin, String gcFlag, String printFlag, String createdBy, String modifiedBy, Long id);

    Optional<AddressDetailsDto> findBySubcustomerId(Long subcustomerId);

}