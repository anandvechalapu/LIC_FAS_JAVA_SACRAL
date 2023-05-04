package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.AddressDetailsDto;
import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.AddressDetailsTempEntity;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.AddressDetailsTempModel;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SubcustomerMakercontrollerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/subcustomers/subcustomer-maker")
public class SubcustomerMakercontrollerController {

    @Autowired
    private SubcustomerMakercontrollerService service;

    @PutMapping("/address-details")
    public ResponseEntity<Object> updateSubCustomerAddressDetails(@Valid @RequestBody AddressDetailsTempModel addressDetailsTempModel) {
        int status = service.updateSubCustomerAddressDetails(AddressDetailsTempEntity.builder()
                                                                    .id(addressDetailsTempModel.getId())
                                                                    .subcustomerId(addressDetailsTempModel.getSubcustomerId())
                                                                    .addressType(addressDetailsTempModel.getAddressType())
                                                                    .addressTypeName(addressDetailsTempModel.getAddressTypeName())
                                                                    .country(addressDetailsTempModel.getCountry())
                                                                    .state(addressDetailsTempModel.getState())
                                                                    .district(addressDetailsTempModel.getDistrict())
                                                                    .addressLine1(addressDetailsTempModel.getAddressLine1())
                                                                    .addressLine2(addressDetailsTempModel.getAddressLine2())
                                                                    .addressLine3(addressDetailsTempModel.getAddressLine3())
                                                                    .town(addressDetailsTempModel.getTown())
                                                                    .locality(addressDetailsTempModel.getLocality())
                                                                    .pin(addressDetailsTempModel.getPin())
                                                                    .gcFlag(addressDetailsTempModel.getGcFlag())
                                                                    .printFlag(addressDetailsTempModel.getPrintFlag())
                                                                    .createdBy(addressDetailsTempModel.getCreatedBy())
                                                                    .modifiedBy(addressDetailsTempModel.getModifiedBy())
                                                                    .build());
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/address-details/{subcustomerId}")
    public ResponseEntity<Object> findBySubcustomerId(@PathVariable Long subcustomerId) {
        return new ResponseEntity<>(service.findBySubcustomerId(subcustomerId), HttpStatus.OK);
    }
}