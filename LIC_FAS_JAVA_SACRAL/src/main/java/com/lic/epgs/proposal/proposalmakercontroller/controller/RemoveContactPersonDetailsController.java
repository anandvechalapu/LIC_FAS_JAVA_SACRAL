package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.model.MPHContactPersonDetailTempModel;
import com.lic.epgs.proposal.proposalmakercontroller.service.RemoveContactPersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contactPerson")
public class RemoveContactPersonDetailsController {

    @Autowired
    RemoveContactPersonDetailsService removeContactPersonDetailsService;

    @DeleteMapping("/delete/{contactPersonId}/{proposalId}")
    public MPHContactPersonDetailTempModel deleteContactPersonDetail(@PathVariable("contactPersonId") Long contactPersonId,
                                                                    @PathVariable("proposalId") Long proposalId) {
        MPHContactPersonDetailTempModel mphContactPersonDetailTempModel = removeContactPersonDetailsService.findByContactPersonIdAndProposalId(contactPersonId, proposalId);
        removeContactPersonDetailsService.deleteByContactPersonIdAndProposalId(contactPersonId, proposalId);
        return mphContactPersonDetailTempModel;
    }

}