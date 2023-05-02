package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.repository.RemoveCustomerAddressDetailsCustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveCustomerAddressDetailsCustomerMakerControllerService {

    @Autowired
    private RemoveCustomerAddressDetailsCustomerMakerControllerRepository removeCustomerAddressDetailsCustomerMakerControllerRepository;

    public CommonResponseDto removeAddressFromAddressDetailsGridAPI(Long addressId, Long customerId) {
        return removeCustomerAddressDetailsCustomerMakerControllerRepository.removeAddressFromAddressDetailsGridAPI(addressId, customerId);
    }

}