package com.lic.epgs.gstexcemption.repository;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GSTResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GstAllDetailsByGstId9GstExcemptionRepository extends JpaRepository<GstExcemptionDto, Long> {
    GSTResponseDto<GstExcemptionDto> getAllDetailsByGstId(Long gstExcemptionId);
}

package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GSTResponseDto;
import com.lic.epgs.gstexcemption.service.GstAllDetailsByGstId9GstExcemptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gstexcemption")
public class GstExcemptionController {

    @Autowired
    private GstAllDetailsByGstId9GstExcemptionService gstAllDetailsByGstId9GstExcemptionService;

    @GetMapping("/details/{gstExcemptionId}")
    public GSTResponseDto<GstExcemptionDto> getAllDetailsByGstId(@PathVariable("gstExcemptionId") Long gstExcemptionId) {
        return gstAllDetailsByGstId9GstExcemptionService.getAllDetailsByGstId(gstExcemptionId);
    }
}