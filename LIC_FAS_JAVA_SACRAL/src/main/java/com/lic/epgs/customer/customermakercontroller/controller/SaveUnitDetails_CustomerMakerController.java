package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.service.SaveUnitDetails_CustomerMakerControllerService;

@RestController
@RequestMapping("/customer/customerMaker/")
public class SaveUnitDetails_CustomerMakerController {
    @Autowired
    private SaveUnitDetails_CustomerMakerControllerService service;

    @RequestMapping(value = "/saveUnitDetails", method = RequestMethod.POST)
    public CommonResponseDto saveUnitDetails(@RequestBody CustomerUnitOfficeDto customerUnitOfficeDto) {
        return service.saveUnitDetails(customerUnitOfficeDto);
    }

    @RequestMapping(value = "/updateUnitDetails", method = RequestMethod.PUT)
    public CommonResponseDto updateUnitDetails(@RequestParam("customerUnitOfficeId") Long customerUnitOfficeId, @RequestBody CustomerUnitOfficeDto customerUnitOfficeDto) {
        return service.updateUnitDetails(customerUnitOfficeId, customerUnitOfficeDto);
    }

    @RequestMapping(value = "/checkCustomerId", method = RequestMethod.POST)
    public CommonResponseDto checkCustomerId(@RequestBody CustomerUnitOfficeDto customerUnitOfficeDto) {
        return service.checkCustomerId(customerUnitOfficeDto);
    }
}