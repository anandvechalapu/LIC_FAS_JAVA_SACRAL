package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.service.GstExcemptionService;

@RestController
public class GstExcemptionController {

    @Autowired
    private GstExcemptionService gstExcemptionService;

    @GetMapping("/gstExcemption/{gstNo}/{unitCode}/{proposalNo}")
    public GstResponseDto<List<GstExcemptionDto>> searchforExisting(@PathVariable String gstNo, @PathVariable String unitCode, @PathVariable String proposalNo) {
        return gstExcemptionService.searchforExisting(gstNo, unitCode, proposalNo);
    }

}