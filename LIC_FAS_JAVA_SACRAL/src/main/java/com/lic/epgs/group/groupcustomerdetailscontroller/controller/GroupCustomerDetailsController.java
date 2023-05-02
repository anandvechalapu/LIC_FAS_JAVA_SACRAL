package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupCustomerDetailsController {

    @Autowired
    private GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;

    @GetMapping("/getGroupBasicDetails/{groupId}")
    public List<CommonResponseDto> getGroupBasicDetails_GROUP_CUSTOMER_DETAILS_CONTROLLER(@PathVariable("groupId") Long groupId, @RequestParam("pageCount") int pageCount, @RequestParam("limit") int limit){
        return groupCustomerDetailsControllerService.getGroupBasicDetails_GROUP_CUSTOMER_DETAILS_CONTROLLER(groupId, pageCount, limit);
    }

}