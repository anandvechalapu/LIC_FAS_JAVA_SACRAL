package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.repository.GstExcemptionRepository;

@Service
public class GstExcemptionService {

    @Autowired
    private GstExcemptionRepository gstExcemptionRepository;

    public GstResponseDto<List<GstExcemptionDto>> searchforExisting(String gstNo, String unitCode, String proposalNo) {
        return gstExcemptionRepository.searchforExisting(gstNo, unitCode, proposalNo);
    }

}