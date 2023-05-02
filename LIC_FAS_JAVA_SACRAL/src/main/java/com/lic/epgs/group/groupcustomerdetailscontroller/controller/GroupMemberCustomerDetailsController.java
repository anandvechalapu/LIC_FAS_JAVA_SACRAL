package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupMemberCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupMemberCustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groupmembercustomerdetails")
public class GroupMemberCustomerDetailsController {

    @Autowired
    private GroupMemberCustomerDetailsService groupMemberCustomerDetailsService;

    @GetMapping("/bygroupcustomerid/{groupCustomerId}")
    public ResponseEntity<List<GroupMemberCustomerDetails>> getByGroupCustomerId(@PathVariable Long groupCustomerId) {
        List<GroupMemberCustomerDetails> groupMemberCustomerDetailsList = groupMemberCustomerDetailsService.findByGroupCustomerId(groupCustomerId);
        if(groupMemberCustomerDetailsList != null && !groupMemberCustomerDetailsList.isEmpty()) {
            return new ResponseEntity<>(groupMemberCustomerDetailsList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/bygroupcustomeridandcustomerid/{groupCustomerId}/{customerId}")
    public ResponseEntity<GroupMemberCustomerDetails> getByGroupCustomerIdAndCustomerId(@PathVariable Long groupCustomerId, @PathVariable Long customerId) {
        Optional<GroupMemberCustomerDetails> groupMemberCustomerDetailsOptional = groupMemberCustomerDetailsService.findByGroupCustomerIdAndCustomerId(groupCustomerId, customerId);
        if(groupMemberCustomerDetailsOptional.isPresent()) {
            return new ResponseEntity<>(groupMemberCustomerDetailsOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/bygroupcustomerid/{groupCustomerId}")
    public ResponseEntity deleteByGroupCustomerId(@PathVariable Long groupCustomerId) {
        groupMemberCustomerDetailsService.deleteByGroupCustomerId(groupCustomerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}