package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.dto.DocumentDetailsDto;
import com.lic.epgs.gstexcemption.service.GstExemptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gst-exemption")
public class GstExemptionController {

    @Autowired
    private GstExemptionService gstExemptionService;

    @GetMapping("/documents/{gstExemptionId}")
    public List<DocumentDetailsDto> getDocumentsByGstExemptionId(@PathVariable Long gstExemptionId) {
        return gstExemptionService.getDocumentsByGstExemptionId(gstExemptionId);
    }

    @GetMapping("/document/{gstExemptionId}/{documentId}")
    public Optional<DocumentDetailsDto> getDocumentByGstExemptionIdAndDocumentId(@PathVariable Long gstExemptionId,
                                                                                @PathVariable Long documentId) {
        return gstExemptionService.getDocumentByGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }

    @GetMapping("/exists/{gstExemptionId}")
    public boolean isGstExemptionExists(@PathVariable Long gstExemptionId) {
        return gstExemptionService.isGstExemptionExists(gstExemptionId);
    }

    @GetMapping("/exists/{gstExemptionId}/{documentId}")
    public boolean isDocumentExistsForGstExemptionIdAndDocumentId(@PathVariable Long gstExemptionId,
                                                                 @PathVariable Long documentId) {
        return gstExemptionService.isDocumentExistsForGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }

    @GetMapping("/exists/document/{documentId}")
    public boolean isDocumentExistsByDocumentId(@PathVariable Long documentId) {
        return gstExemptionService.isDocumentExistsByDocumentId(documentId);
    }

    @GetMapping("/validate/existingCondition1/{gstExemptionId}/{existingCondition1}")
    public List<DocumentDetailsDto> validateExistingCondition1(@PathVariable Long gstExemptionId,
                                                              @PathVariable boolean existingCondition1) {
        return gstExemptionService.validateExistingCondition1(gstExemptionId, existingCondition1);
    }

    @GetMapping("/validate/existingCondition2/{gstExemptionId}/{existingCondition2}")
    public List<DocumentDetailsDto> validateExistingCondition2(@PathVariable Long gstExemptionId,
                                                              @PathVariable boolean existingCondition2) {
        return gstExemptionService.validateExistingCondition2(gstExemptionId, existingCondition2);
    }
}