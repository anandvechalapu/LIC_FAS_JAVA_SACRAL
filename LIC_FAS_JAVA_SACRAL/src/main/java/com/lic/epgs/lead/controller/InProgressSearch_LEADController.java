package com.lic.epgs.lead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.entity.InProgressSearch_LEAD;
import com.lic.epgs.lead.service.InProgressSearch_LEADService;

@RestController
@RequestMapping("/lead")
public class InProgressSearch_LEADController {

    @Autowired
    private InProgressSearch_LEADService inProgressSearch_LEADService;

    @GetMapping("/findByUnitCodeAndUser")
    public InProgressSearch_LEAD findByUnitCodeAndUser(@RequestParam("unitCode") String unitCode, @RequestParam("user") String user) {
        return inProgressSearch_LEADService.findByUnitCodeAndUser(unitCode, user);
    }

    @GetMapping("/getLeadDataByUnitCodeAndUser")
    public List<InProgressSearch_LEAD> getLeadDataByUnitCodeAndUser(@RequestParam("unitCode") String unitCode, @RequestParam("user") String user) {
        return inProgressSearch_LEADService.getLeadDataByUnitCodeAndUser(unitCode, user);
    }

}