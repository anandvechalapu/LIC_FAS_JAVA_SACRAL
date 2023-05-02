package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groupcustomerdetails")
public class GroupCustomerDetailsController {

    @Autowired
    private GroupCustomerDetailsControllerService groupCustomerDetailsControllerService;

    @GetMapping("/findByGroupCustomerIdAndContactId")
    public List<GroupCustomerDetails> findByGroupCustomerIdAndContactId(@RequestParam(value = "groupCustomerId") Long groupCustomerId,
                                                                        @RequestParam(value = "contactId") Long contactId) {
        return groupCustomerDetailsControllerService.findByGroupCustomerIdAndContactId(groupCustomerId, contactId);
    }

    @GetMapping("/findAllByGroupCustomerIdAndContactId")
    public List<GroupCustomerDetails> findAllByGroupCustomerIdAndContactId(@RequestParam(value = "groupCustomerId") Long groupCustomerId,
                                                                          @RequestParam(value = "contactId") Long contactId) {
        return groupCustomerDetailsControllerService.findAllByGroupCustomerIdAndContactId(groupCustomerId, contactId);
    }

    @PostMapping("/save")
    public GroupCustomerDetails save(@RequestBody GroupCustomerDetails groupCustomerDetails) {
        return groupCustomerDetailsControllerService.save(groupCustomerDetails);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody GroupCustomerDetails groupCustomerDetails) {
        groupCustomerDetailsControllerService.delete(groupCustomerDetails);
    }

}