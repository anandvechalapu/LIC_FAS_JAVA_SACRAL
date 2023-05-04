package com.lic.epgs.trust.controller;

import com.lic.epgs.trust.model.ApprovalNotes;
import com.lic.epgs.trust.service.GetApprovalNotesTrustManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trustmanagement/approvalnotes")
public class GetApprovalNotesTrustManagementController {

    @Autowired
    private GetApprovalNotesTrustManagementService service;

    @GetMapping("/{trustId}")
    public Optional<ApprovalNotes> findByTrustId(@PathVariable String trustId) {
        return service.findByTrustId(trustId);
    }

    @GetMapping("/all/{trustId}")
    public List<ApprovalNotes> findAllByTrustId(@PathVariable String trustId) {
        return service.findAllByTrustId(trustId);
    }

    @GetMapping("/all")
    public List<ApprovalNotes> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{trustId}")
    public void deleteByTrustId(@PathVariable String trustId) {
        service.deleteByTrustId(trustId);
    }
}