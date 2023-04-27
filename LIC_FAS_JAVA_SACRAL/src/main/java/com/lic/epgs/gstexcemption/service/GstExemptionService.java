package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.dto.GstNotesDto;
import com.lic.epgs.gstexcemption.repository.GstExemptionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GstExemptionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GstExemptionService.class);

    @Autowired
    private GstExemptionRepository gstExemptionRepository;

    public GstResponseDto<List<GstNotesDto>> getNotesList(String gstExemptionId) {
        try {
            GstResponseDto<List<GstNotesDto>> response = gstExemptionRepository.getNotesList(gstExemptionId);
            if (response != null) {
                return response;
            } else {
                return new GstResponseDto<>(false, "Deny");
            }
        } catch (Exception e) {
            LOGGER.error("Error while retrieving GST notes of GST exemption ID: {}", gstExemptionId, e);
            return new GstResponseDto<>(false, "Fail");
        }
    }

}