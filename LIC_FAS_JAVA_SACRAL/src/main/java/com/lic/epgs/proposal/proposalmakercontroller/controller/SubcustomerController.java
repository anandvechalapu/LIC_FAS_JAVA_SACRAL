package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Subcustomer;
import com.lic.epgs.proposal.proposalmakercontroller.service.SubcustomerService;

@RestController
@RequestMapping("/api/subcustomer")
public class SubcustomerController {

    @Autowired
    private SubcustomerService subcustomerService;

    @GetMapping("/{customerId}")
    public List<Subcustomer> getSubcustomerNameList(@PathVariable Long customerId) {
        return subcustomerService.getSubcustomerNameList(customerId);
    }

}