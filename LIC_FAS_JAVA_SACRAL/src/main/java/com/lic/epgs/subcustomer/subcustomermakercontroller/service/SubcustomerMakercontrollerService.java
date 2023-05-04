package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.AddressDetailsDto;
import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.AddressDetailsTempEntity;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubcustomerMakercontrollerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubcustomerMakercontrollerService {

    @Autowired
    private SubcustomerMakercontrollerRepository repository;

    public int updateSubCustomerAddressDetails(AddressDetailsTempEntity addressDetailsTempEntity) {
        return repository.updateSubCustomerAddressDetails(
                addressDetailsTempEntity.getSubcustomerId(),
                addressDetailsTempEntity.getAddressType(),
                addressDetailsTempEntity.getAddressTypeName(),
                addressDetailsTempEntity.getCountry(),
                addressDetailsTempEntity.getState(),
                addressDetailsTempEntity.getDistrict(),
                addressDetailsTempEntity.getAddressLine1(),
                addressDetailsTempEntity.getAddressLine2(),
                addressDetailsTempEntity.getAddressLine3(),
                addressDetailsTempEntity.getTown(),
                addressDetailsTempEntity.getLocality(),
                addressDetailsTempEntity.getPin(),
                addressDetailsTempEntity.getGcFlag(),
                addressDetailsTempEntity.getPrintFlag(),
                addressDetailsTempEntity.getCreatedBy(),
                addressDetailsTempEntity.getModifiedBy(),
                addressDetailsTempEntity.getId());
    }

    public Optional<AddressDetailsDto> findBySubcustomerId(Long subcustomerId) {
        return repository.findBySubcustomerId(subcustomerId);
    }

}