package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.CommonBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subcustomer/subcustomermakercontroller")
public class OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Controller {
    @Autowired
    private OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service;

    @PutMapping("/update/subcustomer")
    public void updateSubCustomer(@RequestParam int id, @RequestParam String status, @RequestParam String workflowStatus) {
        overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service.updateSubCustomer(id, status, workflowStatus);
    }

    @GetMapping("/get/subcustomer")
    public CommonBasicDetailsDtos getUpdatedSubCustomer(@RequestParam int id) {
        return overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service.getUpdatedSubCustomer(id);
    }
}