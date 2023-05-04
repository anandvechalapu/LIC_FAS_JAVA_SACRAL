package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CommonBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerContactDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubCustomerContactDetailsService {

    @Autowired
    private SubCustomerContactDetailsRepository subCustomerContactDetailsRepository;

    public Optional<CommonBasicDetailsDtos> getSubCustomerContactDetails(Long subCustomerId, Long contactPersonId) {
        return subCustomerContactDetailsRepository.findBySubCustomerIdAndContactPersonId(subCustomerId, contactPersonId);
    }
}