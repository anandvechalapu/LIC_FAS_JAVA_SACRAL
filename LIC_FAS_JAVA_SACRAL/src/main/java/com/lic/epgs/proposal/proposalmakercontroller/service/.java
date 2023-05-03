package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.MPHContactPersonDetailTempEntity;

public interface RemoveContactPersonDetailsService {
    public MPHContactPersonDetailTempEntity findByContactPersonIdAndProposalId(Long contactPersonId, Long proposalId);
    public void deleteByContactPersonIdAndProposalId(Long contactPersonId, Long proposalId);

}