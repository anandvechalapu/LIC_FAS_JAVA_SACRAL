package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.service.GSTExcemptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GSTExcemptionController {

    @Autowired
    GSTExcemptionService gstExcemptionService;

    @GetMapping("/gstExcemption")
    public List<GstExcemptionDto> searchforInProgress(@RequestParam String loginUser, @RequestParam String unitCode, @RequestParam String gstNo, @RequestParam String proposalNo) {
        return gstExcemptionService.searchforInProgress(loginUser, unitCode, gstNo, proposalNo);
    }
}