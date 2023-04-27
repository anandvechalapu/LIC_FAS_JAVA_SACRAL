package com.lic.epgs.gstexcemption.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.SaveGstNotes2Gstexcemption14;
import com.lic.epgs.gstexcemption.service.SaveGstNotes2Gstexcemption14Service;

@RestController
public class SaveGstNotes2Gstexcemption14Controller {

    @Autowired
    private SaveGstNotes2Gstexcemption14Service saveGstNotes2Gstexcemption14Service;

    @GetMapping("/gstexcemption/findByGstExemptionIdAndIsActiveTrue")
    public Optional<SaveGstNotes2Gstexcemption14> findByGstExemptionIdAndIsActiveTrue(@RequestParam String gstExemptionId) {
        return saveGstNotes2Gstexcemption14Service.findByGstExemptionIdAndIsActiveTrue(gstExemptionId);
    }

    @PostMapping("/gstexcemption/save")
    public SaveGstNotes2Gstexcemption14 save(@RequestBody SaveGstNotes2Gstexcemption14 saveGstNotes2Gstexcemption14) {
        return saveGstNotes2Gstexcemption14Service.save(saveGstNotes2Gstexcemption14);
    }

    @PostMapping("/gstexcemption/deleteByGstExemptionId")
    public void deleteByGstExemptionId(@RequestParam String gstExemptionId) {
        saveGstNotes2Gstexcemption14Service.deleteByGstExemptionId(gstExemptionId);
    }

}