package com.lic.epgs.customer.customercheckercontroller.service;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.model.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customercheckercontroller.repository.RejectCustomerCheckerControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RejectCustomerCheckerControllerService {

    @Autowired
    private RejectCustomerCheckerControllerRepository rejectCustomerCheckerControllerRepository;

    public CommonResponseDto rejectCustomer(CustomerBasicDetailsDto customerBasicDetailsDto) {
        return rejectCustomerCheckerControllerRepository.rejectCustomer(customerBasicDetailsDto);
    }

}