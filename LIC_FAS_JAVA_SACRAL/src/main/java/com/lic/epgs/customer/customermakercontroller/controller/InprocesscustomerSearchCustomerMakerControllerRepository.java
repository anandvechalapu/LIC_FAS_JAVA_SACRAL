package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import org.springframework.stereotype.Repository;

@Repository
public class InprocesscustomerSearchCustomerMakerControllerRepository {
    
    public CommonResponseDto getInprocessCustomerSearch(String roleType, String unitCode, String customerName, String trustCode, String trustName){
        CommonResponseDto commonResponseDto = new CommonResponseDto();
        commonResponseDto.setRoleType(roleType);
        commonResponseDto.setUnitCode(unitCode);
        commonResponseDto.setCustomerName(customerName);
        commonResponseDto.setTrustCode(trustCode);
        commonResponseDto.setTrustName(trustName);
        return commonResponseDto;
    }
}

package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.service.InprocesscustomerSearchCustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InprocesscustomerSearchCustomerMakerController {

    @Autowired
    private InprocesscustomerSearchCustomerMakerControllerService inprocesscustomerSearchCustomerMakerControllerService;

    @GetMapping("/inprocessCustomerSearch")
    public CommonResponseDto getInprocessCustomerSearch(@RequestParam(value = "roleType") String roleType,
                                                       @RequestParam(value = "unitCode") String unitCode,
                                                       @RequestParam(value = "customerName") String customerName,
                                                       @RequestParam(value = "trustCode") String trustCode,
                                                       @RequestParam(value = "trustName") String trustName){
        return inprocesscustomerSearchCustomerMakerControllerService.getInprocessCustomerSearch(roleType, unitCode, customerName, trustCode, trustName);
    }
}