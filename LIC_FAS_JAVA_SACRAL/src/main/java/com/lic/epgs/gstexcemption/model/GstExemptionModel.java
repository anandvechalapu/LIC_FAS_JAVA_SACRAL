package com.lic.epgs.gstexcemption.model;

import java.util.List;

import com.lic.epgs.gstexcemption.dto.GstResponseDto;
import com.lic.epgs.gstexcemption.dto.GstNotesDto;

public class GstExemptionModel {

    private String gstExemptionId;
    private List<GstNotesDto> gstNotesList;

    public GstExemptionModel() {

    }

    public GstExemptionModel(String gstExemptionId, List<GstNotesDto> gstNotesList) {
        this.gstExemptionId = gstExemptionId;
        this.gstNotesList = gstNotesList;
    }

    public String getGstExemptionId() {
        return gstExemptionId;
    }

    public void setGstExemptionId(String gstExemptionId) {
        this.gstExemptionId = gstExemptionId;
    }

    public List<GstNotesDto> getGstNotesList() {
        return gstNotesList;
    }

    public void setGstNotesList(List<GstNotesDto> gstNotesList) {
        this.gstNotesList = gstNotesList;
    }

    public GstResponseDto<List<GstNotesDto>> getNotesList() {
        if (gstNotesList != null && !gstNotesList.isEmpty()) {
            return new GstResponseDto<>(gstNotesList);
        } else {
            return new GstResponseDto<>(false, "Deny");
        }
    }
}