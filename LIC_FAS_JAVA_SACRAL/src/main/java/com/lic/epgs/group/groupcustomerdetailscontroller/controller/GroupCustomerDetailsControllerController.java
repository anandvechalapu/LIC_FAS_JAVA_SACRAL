package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/groupCustomerDetailsController")
public class GroupCustomerDetailsControllerController {

    @Autowired
    private GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;

    @GetMapping("/getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER")
    public List<GroupCustomerDetailsController> getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER(@RequestParam String groupName,
                                                                                                         @RequestParam String groupCode, @RequestParam String groupStatus,
                                                                                                         @RequestParam String workflowStatus, @RequestParam Integer pageCount,
                                                                                                         @RequestParam Integer limit, @RequestParam Date startDate,
                                                                                                         @RequestParam Date endDate) {
        return groupCustomerDetailsControllerService.getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER(groupName, groupCode,
                groupStatus, workflowStatus, pageCount, limit, startDate, endDate);
    }

}