package com.lic.epgs.gstexcemption.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.SaveGstNotes2Gstexcemption14;
import com.lic.epgs.gstexcemption.repository.SaveGstNotes2Gstexcemption14Repository;

@Service
public class SaveGstNotes2Gstexcemption14Service {

    @Autowired
    private SaveGstNotes2Gstexcemption14Repository saveGstNotes2Gstexcemption14Repository;

    public Optional<SaveGstNotes2Gstexcemption14> findByGstExemptionIdAndIsActiveTrue(String gstExemptionId) {
        return saveGstNotes2Gstexcemption14Repository.findByGstExemptionIdAndIsActiveTrue(gstExemptionId);
    }

    public SaveGstNotes2Gstexcemption14 save(SaveGstNotes2Gstexcemption14 saveGstNotes2Gstexcemption14) {
        return saveGstNotes2Gstexcemption14Repository.save(saveGstNotes2Gstexcemption14);
    }

    public void deleteByGstExemptionId(String gstExemptionId) {
        saveGstNotes2Gstexcemption14Repository.deleteByGstExemptionId(gstExemptionId);
    }

}