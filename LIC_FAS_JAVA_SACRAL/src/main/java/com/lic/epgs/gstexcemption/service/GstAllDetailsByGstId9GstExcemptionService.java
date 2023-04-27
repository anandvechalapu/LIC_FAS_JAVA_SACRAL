package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GSTResponseDto;
import com.lic.epgs.gstexcemption.repository.GstAllDetailsByGstId9GstExcemptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstAllDetailsByGstId9GstExcemptionService {

    @Autowired
    private GstAllDetailsByGstId9GstExcemptionRepository gstAllDetailsByGstId9GstExcemptionRepository;

    public GSTResponseDto<GstExcemptionDto> getAllDetailsByGstId(Long gstExcemptionId) {
        return gstAllDetailsByGstId9GstExcemptionRepository.getAllDetailsByGstId(gstExcemptionId);
    }
}