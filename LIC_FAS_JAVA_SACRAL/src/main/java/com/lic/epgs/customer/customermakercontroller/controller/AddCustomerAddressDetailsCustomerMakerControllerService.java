package com.lic.epgs.customer.customermakercontroller.service;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerMakerControllerDto;
import com.lic.epgs.customer.customermakercontroller.repository.AddCustomerAddressDetailsCustomerMakerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddCustomerAddressDetailsCustomerMakerControllerService {

    @Autowired
    private AddCustomerAddressDetailsCustomerMakerControllerRepository addCustomerAddressDetailsCustomerMakerControllerRepository;

    public CommonResponseDto addCustomerAddressDetailsGridAPI(CustomerMakerControllerDto customerMakerControllerDto) {
        return addCustomerAddressDetailsCustomerMakerControllerRepository.addCustomerAddressDetailsGridAPI(customerMakerControllerDto);
    }

}

package com.lic.epgs.customer.customermakercontroller.controller;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customermakercontroller.model.CustomerMakerControllerDto;
import com.lic.epgs.customer.customermakercontroller.service.AddCustomerAddressDetailsCustomerMakerControllerService;
import com.lic.epgs.customer.customermakercontroller.service.RemoveCustomerAddressDetailsCustomerMakerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerMakerController {

    @Autowired
    private AddCustomerAddressDetailsCustomerMakerControllerService addCustomerAddressDetailsCustomerMakerControllerService;

    @Autowired
    private RemoveCustomerAddressDetailsCustomerMakerControllerService removeCustomerAddressDetailsCustomerMakerControllerService;

    @PostMapping("/addCustomerAddressDetailsGridAPI")
    public CommonResponseDto addCustomerAddressDetailsGridAPI(@RequestBody CustomerMakerControllerDto customerMakerControllerDto) {
        return addCustomerAddressDetailsCustomerMakerControllerService.addCustomerAddressDetailsGridAPI(customerMakerControllerDto);
    }

    @DeleteMapping("/removeAddressFromAddressDetailsGridAPI/{addressId}/{customerId}")
    public CommonResponseDto removeAddressFromAddressDetailsGridAPI(@PathVariable("addressId") Long addressId, @PathVariable("customerId") Long customerId) {
        return removeCustomerAddressDetailsCustomerMakerControllerService.removeAddressFromAddressDetailsGridAPI(addressId, customerId);
    }
}