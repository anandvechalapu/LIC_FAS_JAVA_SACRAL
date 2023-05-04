package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerAddressDetailsDto;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerAddressDetailsRepository;

@Service
public class SubCustomerAddressDetailsService {

    @Autowired
    SubCustomerAddressDetailsRepository subCustomerAddressDetailsRepository;

    public List<SubCustomerAddressDetailsDto> getSubCustomerAddressDetailsBySubCustomerId(Long subCustomerId) {
        return subCustomerAddressDetailsRepository.findBySubCustomerId(subCustomerId);
    }

    public SubCustomerAddressDetailsDto getSubCustomerAddressDetailsBySubAddressIdAndSubCustomerId(Long subAddressId, Long subCustomerId) {
        return subCustomerAddressDetailsRepository.findBySubAddressIdAndSubCustomerId(subAddressId, subCustomerId);
    }
}