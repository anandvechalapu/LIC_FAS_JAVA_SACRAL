import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.deposittransfer.entity.DepositTransfer;

@Repository
public interface SelectApproveOrReject_DepositTransferRepository extends JpaRepository<DepositTransfer, Long> {

    DepositTransfer findByTransferIdAndModifiedByAndTransferStatusAndWorkflowStatus(Long transferId, Long modifiedBy, String transferStatus, String workflowStatus);

    void saveAndFlush(DepositTransfer depositTransfer);

    void setIsActiveFalseInDepositTransferNotesTempTable(Long transferId);

}