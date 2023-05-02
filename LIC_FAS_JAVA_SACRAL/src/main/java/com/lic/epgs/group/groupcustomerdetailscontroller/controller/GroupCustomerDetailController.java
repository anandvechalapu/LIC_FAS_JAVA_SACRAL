package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.entity.GroupCustomerBasicDetailsTempEntity;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groupcustomerdetails")
public class GroupCustomerDetailController {

    @Autowired
    private GroupCustomerDetailsService groupCustomerDetailsService;

    @GetMapping("/{groupCustomerId}")
    public ResponseEntity<GroupCustomerBasicDetailsTempEntity> findByGroupCustomerId(@PathVariable String groupCustomerId) {
        return ResponseEntity.ok(groupCustomerDetailsService.findByGroupCustomerId(groupCustomerId));
    }

    @PostMapping
    public ResponseEntity<GroupCustomerBasicDetailsTempEntity> save(@RequestBody GroupCustomerBasicDetailsDto groupCustomerBasicDetailsDto) {
        return ResponseEntity.ok(groupCustomerDetailsService.save(groupCustomerBasicDetailsDto));
    }

    @PutMapping("/{groupCustomerId}/{groupStatus}/{workflowStatus}")
    public ResponseEntity<CommonResponseDto> updateGroupStatusAndWorkflowStatus(@PathVariable Long groupCustomerId, 
    @PathVariable String groupStatus, @PathVariable String workflowStatus) {
        return ResponseEntity.ok(groupCustomerDetailsService.updateGroupStatusAndWorkflowStatus(groupCustomerId, groupStatus, workflowStatus));
    }

}