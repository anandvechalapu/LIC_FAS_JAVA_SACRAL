package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.model.RemoveGstDocumentDetails12;
import com.lic.epgs.gstexcemption.service.RemoveGstDocumentDetails12Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remove_gst_document_details_12")
public class RemoveGstDocumentDetails12Controller {

    @Autowired
    private RemoveGstDocumentDetails12Service removeGstDocumentDetails12Service;

    @GetMapping("/check_exemption_id_exists")
    public boolean checkExemptionIdExists(@RequestParam String gstExemptionId) {
        return removeGstDocumentDetails12Service.checkExemptionIdExists(gstExemptionId);
    }

    @GetMapping("/check_document_id_exists")
    public boolean checkDocumentIdExists(@RequestParam String documentId) {
        return removeGstDocumentDetails12Service.checkDocumentIdExists(documentId);
    }

    @DeleteMapping("/delete")
    public void deleteByGstExemptionIdAndDocumentId(@RequestParam String gstExemptionId, @RequestParam String documentId) {
        removeGstDocumentDetails12Service.deleteByGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }
}