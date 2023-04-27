package com.lic.epgs.gstexcemption.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.dto.GstNotesDto;
import com.lic.epgs.gstexcemption.service.GstExemptionService;

@RestController
@RequestMapping("/gst/exemption")
public class GstExemptionController {

    private GstExemptionService gstExemptionService;

    public GstExemptionController(GstExemptionService gstExemptionService) {
        this.gstExemptionService = gstExemptionService;
    }

    @GetMapping("/{gstExemptionId}/notes")
    public GstResponseDto<List<GstNotesDto>> getNotesList(@PathVariable("gstExemptionId")String gstExemptionId) {
        return gstExemptionService.getNotesList(gstExemptionId);
    }
}