package com.lic.epgs.gstexcemption.repository;

import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.dto.GstNotesDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GstExemptionRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(GstExemptionRepository.class);

    @Autowired
    private GstExemptionDao gstExemptionDao;

    public GstResponseDto<List<GstNotesDto>> getNotesList(String gstExemptionId) {
        try {
            List<GstNotesDto> gstNotesList = gstExemptionDao.getNotesList(gstExemptionId);
            if (gstNotesList != null && !gstNotesList.isEmpty()) {
                return new GstResponseDto<>(gstNotesList);
            } else {
                return new GstResponseDto<>(false, "Deny");
            }
        } catch (Exception e) {
            LOGGER.error("Error while retrieving GST notes of GST exemption ID: {}", gstExemptionId, e);
            return new GstResponseDto<>(false, "Fail");
        }
    }
}