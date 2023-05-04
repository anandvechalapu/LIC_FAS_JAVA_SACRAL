package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.CommonBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerBasicDetailsDtos;
import com.lic.epgs.subcustomer.subcustomermakercontroller.entity.SubCustomerBasicDetailsTempEntity;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER_Service {
    @Autowired
    private OverAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER;

    @Transactional
    public void updateSubCustomer(int id, String status, String workflowStatus) {
        overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER.updateSubCustomer(id, status, workflowStatus);
    }

    public CommonBasicDetailsDtos getUpdatedSubCustomer(int id) {
        return overAllSaveSubCustomerDetails_SUB_CUSTOMER_MAKER_CONTROLLER.getUpdatedSubCustomer(id);
    }

}