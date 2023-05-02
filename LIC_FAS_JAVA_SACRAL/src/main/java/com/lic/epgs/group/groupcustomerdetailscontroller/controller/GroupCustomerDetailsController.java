package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsService;

@RestController
@RequestMapping("/groupcustomerdetails")
public class GroupCustomerDetailsController {
    
    @Autowired
    private GroupCustomerDetailsService groupCustomerDetailsService;

    @PostMapping
    public GroupCustomerDetails save(@RequestBody GroupCustomerDetails groupCustomerDetails) {
        return groupCustomerDetailsService.save(groupCustomerDetails);
    }

    @GetMapping("/{groupCustomerId}/{unitCode}")
    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerIdAndUnitCode(@PathVariable Long groupCustomerId,
            @PathVariable String unitCode) {
        return groupCustomerDetailsService.getGroupDetailsMakerByGroupCustomerIdAndUnitCode(groupCustomerId, unitCode);
    }

    @GetMapping("/{groupCustomerId}")
    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerId(@PathVariable Long groupCustomerId) {
        return groupCustomerDetailsService.getGroupDetailsMakerByGroupCustomerId(groupCustomerId);
    }

    @GetMapping
    public List<GroupCustomerDetails> findAll() {
        return groupCustomerDetailsService.findAll();
    }

}