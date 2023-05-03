package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.model.RsaveNotesDetails_PROPOSALMAKERCONTROLLER;
import com.lic.epgs.proposal.proposalmakercontroller.repository.RsaveNotesDetails_PROPOSALMAKERCONTROLLERRepository;

@Service
public class RsaveNotesDetails_PROPOSALMAKERCONTROLLERService {

    @Autowired
    private RsaveNotesDetails_PROPOSALMAKERCONTROLLERRepository rsaveNotesDetailsRepository;

    public RsaveNotesDetails_PROPOSALMAKERCONTROLLER createRsaveNotesDetails(RsaveNotesDetails_PROPOSALMAKERCONTROLLER rsaveNotesDetails) {
        return rsaveNotesDetailsRepository.save(rsaveNotesDetails);
    }

    public List<RsaveNotesDetails_PROPOSALMAKERCONTROLLER> getAllRsaveNotesDetails() {
        return rsaveNotesDetailsRepository.findAll();
    }

    public Optional<RsaveNotesDetails_PROPOSALMAKERCONTROLLER> getRsaveNotesDetailsById(Long id) {
        return rsaveNotesDetailsRepository.findById(id);
    }

    public void deleteRsaveNotesDetails(Long id) {
    	rsaveNotesDetailsRepository.deleteById(id);
    }

    public RsaveNotesDetails_PROPOSALMAKERCONTROLLER findByProposalId(Long proposalId) {
        return rsaveNotesDetailsRepository.findByProposalId(proposalId);
    }

    public void deleteByProposalId(Long proposalId) {
        rsaveNotesDetailsRepository.deleteByProposalId(proposalId);
    }

}