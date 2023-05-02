package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.model.CustomerUnitOffice;
import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;

@Repository
public interface GetUnitCustomerMakerControllerRepository extends JpaRepository<CustomerUnitOffice, Integer> {

    CustomerUnitOfficeDto findByCustomerId(Integer customerId);

}

package com.lic.epgs.customer.customermakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.service.GetUnitCustomerMakerControllerService;

@RestController
@RequestMapping("/customer")
public class GetUnitCustomerMakerController {

    @Autowired
    private GetUnitCustomerMakerControllerService getUnitCustomerMakerControllerService;

    @GetMapping("/getUnitCustomerMakerController")
    public CustomerUnitOfficeDto getUnitCustomerMakerController(Integer customerId) {
        return getUnitCustomerMakerControllerService.getUnitCustomerMakerController(customerId);
    }

}