package com.lic.epgs.customer.customermakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.repository.SaveUnitDetails_CustomerMakerControllerRepository;

@Service
public class SaveUnitDetails_CustomerMakerControllerService {

    @Autowired
    private SaveUnitDetails_CustomerMakerControllerRepository repository;

    public CommonResponseDto saveUnitDetails(CustomerUnitOfficeDto customerUnitOfficeDto) {
        CommonResponseDto response = repository.saveUnitDetails(customerUnitOfficeDto);
        if (response.getTransactionStatus().equals("SUCCESS")) {
            response.setTransactionMessage("Save");
        }
        return response;
    }

    public CommonResponseDto updateUnitDetails(Long customerUnitOfficeId, CustomerUnitOfficeDto customerUnitOfficeDto) {
        CommonResponseDto response = repository.updateUnitDetails(customerUnitOfficeId, customerUnitOfficeDto);
        if (response.getTransactionStatus().equals("SUCCESS")) {
            response.setTransactionMessage("Update");
        }
        return response;
    }

    public CommonResponseDto checkCustomerId(CustomerUnitOfficeDto customerUnitOfficeDto) {
        CommonResponseDto response = repository.checkCustomerId(customerUnitOfficeDto);
        if (response.getTransactionStatus().equals("FAIL")) {
            response.setTransactionMessage("Invalid customer");
        }
        return response;
    }

}