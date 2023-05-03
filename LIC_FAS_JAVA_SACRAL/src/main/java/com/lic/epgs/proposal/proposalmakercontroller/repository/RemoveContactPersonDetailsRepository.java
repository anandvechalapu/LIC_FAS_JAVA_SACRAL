import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.MPHContactPersonDetailTempEntity;

public interface RemoveContactPersonDetailsRepository extends JpaRepository<MPHContactPersonDetailTempEntity, Long> {

    public MPHContactPersonDetailTempEntity findByContactPersonIdAndProposalId(Long contactPersonId, Long proposalId);

    public void deleteByContactPersonIdAndProposalId(Long contactPersonId, Long proposalId);

}