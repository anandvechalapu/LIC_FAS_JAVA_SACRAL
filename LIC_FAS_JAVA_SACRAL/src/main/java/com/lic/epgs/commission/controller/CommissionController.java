package com.lic.epgs.commission.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.service.SendToChecker13CommissionService;

@RestController
public class CommissionController {
    
    @Autowired
    private SendToChecker13CommissionService sendToChecker13CommissionService;
    
    @PostMapping("/commission/sendToChecker")
    public int sendToChecker(@RequestParam String status, @RequestParam String workflowStatus, @RequestParam String modifiedBy, @RequestParam LocalDateTime modifiedOn, @RequestParam Long id) {
        return sendToChecker13CommissionService.sendToChecker(status, workflowStatus, modifiedBy, modifiedOn, id);
    }

}