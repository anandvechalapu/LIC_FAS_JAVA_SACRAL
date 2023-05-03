package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.RsaveNotesDetails_PROPOSALMAKERCONTROLLER;
import com.lic.epgs.proposal.proposalmakercontroller.service.RsaveNotesDetails_PROPOSALMAKERCONTROLLERService;

@RestController
@RequestMapping("/proposalmakercontroller/rsave-notes-details")
public class RsaveNotesDetails_PROPOSALMAKERCONTROLLERController {

    @Autowired
    private RsaveNotesDetails_PROPOSALMAKERCONTROLLERService rsaveNotesDetailsService;

    @PostMapping
    public RsaveNotesDetails_PROPOSALMAKERCONTROLLER createRsaveNotesDetails(@RequestBody RsaveNotesDetails_PROPOSALMAKERCONTROLLER rsaveNotesDetails) {
        return rsaveNotesDetailsService.createRsaveNotesDetails(rsaveNotesDetails);
    }

    @GetMapping
    public List<RsaveNotesDetails_PROPOSALMAKERCONTROLLER> getAllRsaveNotesDetails() {
        return rsaveNotesDetailsService.getAllRsaveNotesDetails();
    }

    @GetMapping("/{rsaveNotesDetails_id}")
    public Optional<RsaveNotesDetails_PROPOSALMAKERCONTROLLER> getRsaveNotesDetailsById(@PathVariable(value = "rsaveNotesDetails_id") Long id) {
        return rsaveNotesDetailsService.getRsaveNotesDetailsById(id);
    }

    @GetMapping("/proposalId/{proposalId}")
    public RsaveNotesDetails_PROPOSALMAKERCONTROLLER getRsaveNotesDetailsByProposalId(@PathVariable(value = "proposalId") Long proposalId) {
        return rsaveNotesDetailsService.findByProposalId(proposalId);
    }

    @PutMapping
    public RsaveNotesDetails_PROPOSALMAKERCONTROLLER updateRsaveNotesDetails(@RequestBody RsaveNotesDetails_PROPOSALMAKERCONTROLLER rsaveNotesDetails) {
        return rsaveNotesDetailsService.createRsaveNotesDetails(rsaveNotesDetails);
    }

    @DeleteMapping("/{rsaveNotesDetails_id}")
    public void deleteRsaveNotesDetailsById(@PathVariable(value = "rsaveNotesDetails_id") Long id) {
    	rsaveNotesDetailsService.deleteRsaveNotesDetails(id);
    }

    @DeleteMapping("/proposalId/{proposalId}")
    public void deleteRsaveNotesDetailsByProposalId(@PathVariable(value = "proposalId") Long proposalId) {
        rsaveNotesDetailsService.deleteByProposalId(proposalId);
    }

}