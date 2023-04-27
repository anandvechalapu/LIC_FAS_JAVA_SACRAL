@Service
public class GstExcemptionService {

    @Autowired
    private GstExcemptionRepository gstExcemptionRepository;

    // Method to save a new GST exemption request
    public GstExcemption saveGstExcemption(GstExcemption gstExcemption) {
        return gstExcemptionRepository.saveGstExcemption(gstExcemption);
    }

    // Method to save all the related notes and documents as a new entry in the respective entity
    public void saveGstExcemptionNotesAndDocuments(GstExcemption gstExcemption) {
        gstExcemptionRepository.saveGstExcemptionNotesAndDocuments(gstExcemption);
    }

    // Method to approve a GST exemption request
    public int approveGstExcemption(Long gstExcemptionId, String gstExcemptionStatus, Long modifiedBy, String workFlowStatus) {
        return gstExcemptionRepository.approveGstExcemption(gstExcemptionId, gstExcemptionStatus, modifiedBy, workFlowStatus);
    }

    // Method to check if the gstExcemptionId exists
    public boolean existsByGstExcemptionId(Long gstExcemptionId) {
        return gstExcemptionRepository.existsByGstExcemptionId(gstExcemptionId);
    }
}

package com.lic.epgs.gstexcemption.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.entity.GstExcemption;
import com.lic.epgs.gstexcemption.services.GstExcemptionService;
import com.lic.epgs.gstexcemption.services.Rejected6GstExcemptionService;

@RestController
@RequestMapping("/gstexcemption")
public class GstExcemptionController {

    @Autowired
    GstExcemptionService gstExcemptionService;

    @Autowired
    Rejected6GstExcemptionService rejected6GstExcemptionService;

    @PostMapping("/saveGstExcemption")
    public GstExcemption saveGstExcemption(@RequestBody GstExcemption gstExcemption) {
        if (gstExcemptionService.existsByGstExcemptionId(gstExcemption.getGstExcemptionId())) {
            return gstExcemptionService.saveGstExcemption(gstExcemption);
        } else {
            return rejected6GstExcemptionService.saveRejectedGstExcemption(gstExcemption);
        }
    }


    @PostMapping("/approveGstExcemption")
    public int approveGstExcemption(Long gstExcemptionId, String gstExcemptionStatus, Long modifiedBy, String workFlowStatus) {
        if (gstExcemptionService.existsByGstExcemptionId(gstExcemptionId)) {
            return gstExcemptionService.approveGstExcemption(gstExcemptionId, gstExcemptionStatus, modifiedBy, workFlowStatus);
        } else {
            return 0;
        }
    }

    @PostMapping("/rejectGstExcemption")
    public int rejectGstExcemption(Long gstExcemptionId, String gstExcemptionStatus, String rejectionRemarks, Long modifiedBy, String workFlowStatus) {
        if (gst