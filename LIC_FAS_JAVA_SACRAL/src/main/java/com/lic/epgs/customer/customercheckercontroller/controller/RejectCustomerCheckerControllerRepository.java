package com.lic.epgs.customer.customercheckercontroller.repository;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.model.CustomerBasicDetailsDto;

import org.springframework.stereotype.Repository;

@Repository
public class RejectCustomerCheckerControllerRepository {

    public CommonResponseDto rejectCustomer(CustomerBasicDetailsDto customerBasicDetailsDto) {
        return new CommonResponseDto("Rejected", "Customer Rejected Successfully", customerBasicDetailsDto);
    }

}

package com.lic.epgs.customer.customercheckercontroller.controller;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.model.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customercheckercontroller.service.RejectCustomerCheckerControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RejectCustomerCheckerController {
    
    @Autowired
    private RejectCustomerCheckerControllerService rejectCustomerCheckerControllerService;

    @PostMapping("/rejectCustomer")
    public CommonResponseDto rejectCustomer(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto) {
        return rejectCustomerCheckerControllerService.rejectCustomer(customerBasicDetailsDto);
    }
}