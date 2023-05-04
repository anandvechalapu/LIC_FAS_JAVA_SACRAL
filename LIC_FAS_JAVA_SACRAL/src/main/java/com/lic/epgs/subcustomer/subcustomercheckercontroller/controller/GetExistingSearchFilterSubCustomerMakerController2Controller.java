package com.lic.epgs.subcustomer.subcustomercheckercontroller.controller;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.service.GetExistingSearchFilterSubCustomerMakerController2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sub-customer")
public class GetExistingSearchFilterSubCustomerMakerController2Controller {

    @Autowired
    private GetExistingSearchFilterSubCustomerMakerController2Service getExistingSearchFilterSubCustomerMakerController2Service;

    @GetMapping("/search/customer-code")
    public List<SubCustomer> findByCustomerCode(@RequestParam String customerCode) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByCustomerCode(customerCode);
    }

    @GetMapping("/search/customer-name")
    public List<SubCustomer> findByCustomerName(@RequestParam String customerName) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByCustomerName(customerName);
    }

    @GetMapping("/search/customer-type")
    public List<SubCustomer> findByCustomerType(@RequestParam String customerType) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByCustomerType(customerType);
    }

    @GetMapping("/search/pan")
    public List<SubCustomer> findByPan(@RequestParam String pan) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByPan(pan);
    }

    @GetMapping("/search/start-date")
    public List<SubCustomer> findByStartDate(@RequestParam Date startDate) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByStartDate(startDate);
    }

    @GetMapping("/search/end-date")
    public List<SubCustomer> findByEndDate(@RequestParam Date endDate) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByEndDate(endDate);
    }

    @GetMapping("/search/role-type")
    public List<SubCustomer> findByRoleType(@RequestParam String roleType) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByRoleType(roleType);
    }

    @GetMapping("/search/unit-code")
    public List<SubCustomer> findByUnitCode(@RequestParam String unitCode) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByUnitCode(unitCode);
    }

    @GetMapping("/search/sub-customer-status")
    public List<SubCustomer> findBySubCustomerStatus(@RequestParam String subCustomerStatus) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findBySubCustomerStatus(subCustomerStatus);
    }

    @GetMapping("/search/all-ordered-by-customer-code")
    public List<SubCustomer> findAllOrderedByCustomerCode() {
        return getExistingSearchFilterSubCustomerMakerController2Service.findAllOrderedByCustomerCode();
    }

    @GetMapping("/search/multiple-fields")
    public List<SubCustomer> findByMultipleFields(@RequestParam String customerCode,
                                                 @RequestParam String customerName,
                                                 @RequestParam String customerType,
                                                 @RequestParam String pan,
                                                 @RequestParam Date startDate,
                                                 @RequestParam Date endDate,
                                                 @RequestParam String roleType,
                                                 @RequestParam String unitCode,
                                                 @RequestParam String subCustomerStatus) {
        return getExistingSearchFilterSubCustomerMakerController2Service.findByMultipleFields(customerCode,
                customerName,
                customerType,
                pan,
                startDate,
                endDate,
                roleType,
                unitCode,
                subCustomerStatus);
    }
}