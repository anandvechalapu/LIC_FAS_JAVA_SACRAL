package com.lic.epgs.gstexcemption.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "save_gst_notes_2_gstexcemption_14")
public class SaveGstNotes2Gstexcemption14 {

    @Id
    private String gstExemptionId;
    private boolean isActive;

    public String getGstExemptionId() {
        return gstExemptionId;
    }

    public void setGstExemptionId(String gstExemptionId) {
        this.gstExemptionId = gstExemptionId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}